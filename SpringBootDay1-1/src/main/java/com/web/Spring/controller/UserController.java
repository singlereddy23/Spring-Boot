package com.web.Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.Spring.model.User;

@RestController
@RequestMapping("/userapi")	//http://localhost:8081/userapi
public class UserController
{
	@GetMapping("/1")	//http://localhost:8081/userapi/1
	public String greet() {
		return "Welcome To The User Management API";
	}
	
	@GetMapping(value = "/2", produces = {"application/json"})	//http://localhost:8081/userapi/2
	public User GetUser() {
		return new User(101, "Kamal", "SR23RK@gmail.com");
	}
	
}