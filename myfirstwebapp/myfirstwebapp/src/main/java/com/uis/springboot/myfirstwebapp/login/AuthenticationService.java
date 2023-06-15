package com.uis.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean aunthenticate(String username, String password) {

		boolean isValidUserName = username.equalsIgnoreCase("uis");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");

		return isValidUserName && isValidPassword;
	}
}
