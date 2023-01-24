/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sel.macro.controller;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sel.macro.model.User;

@RestController
public class UserController {
	
	@GetMapping(path="/user")
	public User getUser(@RequestParam(name = "id",required=true) Long id) {
		User user=new User();
		user.setId(id);
		user.setName("selvam SELLADURAI"+id);
		user.setEmail("selva121s@gmail.com");
		user.setAddress("3/29 Middle Street,P K Agaram, Lalgudi Tk, Trichy Dt");
		user.setLoggedIn(Date.from(Instant.now()));
		user.setLoggedInTime(LocalDateTime.of(2023,Month.JANUARY, 24, 21, 31, 41));
		return user;
	}
}

	