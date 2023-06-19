package com.web.Spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.web.Spring.Model.User;

@Service
public class UserService
{
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(23, "Kamal", "kjsghkjah@986"));
		users.add(new User(18, "SaiTeja", "sgeklmkls@89"));
		users.add(new User(57, "Vishnu", "hgsgha@456"));
		users.add(new User(45, "Manju", "dtjhdhx@658"));
	}
	
	public List<User> getUsers(){
		return users;
	}
	
	public void saveUsers(User user) {
		users.add(user);
	}
}