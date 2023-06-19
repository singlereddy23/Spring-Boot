package com.web.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.Spring.Model.User;
import com.web.Spring.service.UserService;

@RestController
@RequestMapping("/userapi")	//http://localhost:8082/userapi/1
public class UserController
{
	@GetMapping(value = "/1", produces = {"application/json"})
	public User UserDetails() {
		return new User(23, "kamal", "kjsenfgse@97");
	}
	
	@Autowired
	private UserService service;
	@GetMapping(value = "/2", produces = {"application/json"})	//http://localhost:8082/userapi/2
	public List<User> ListUserDetails() {
		return service.getUsers();
	}
	
	@Autowired
	private UserService servicee;
	@GetMapping(value = "/3", produces = {"application/json","application/xml"})	//http://localhost:8082/userapi/2
	public List<User> ListUserDetailss() {
		return servicee.getUsers();
	}
}