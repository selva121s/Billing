package com.sel.macro.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String email;
	private String address;
	private String password;
	private String confirmPassword;
	private String role;
	private Date loggedIn;
	private LocalDateTime loggedInTime;

}
