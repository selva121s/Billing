package com.sel.macro.controller;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sel.macro.model.User;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {
	
	@GetMapping(path="/user")
	public User getUser(@RequestParam(name = "id",required=true) Long id) {
		log.info("inside getUser...");
		User user=new User();
		user.setId(id);
		user.setName(id+" - selvam SELLADURAI");
		user.setEmail("selva121s@gmail.com");
		user.setAddress("3/29 Middle Street,P K Agaram, Lalgudi Tk, Trichy Dt");
		user.setLoggedIn(Date.from(Instant.now()));
		user.setLoggedInTime(LocalDateTime.of(2023,Month.JANUARY, 24, 21, 31, 41));
		return user;
	}
}

	