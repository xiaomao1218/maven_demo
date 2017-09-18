package com.idea.redis.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.idea.redis.entity.User;
import com.idea.redis.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/add")
	public String addUser(String id, String userName, String password){
		User user = new User();
		user.setId(new BigInteger(id));
		user.setUserName(userName);
		user.setPassword(password);
		userService.addUser(user);
		return "success";
	}
	
	@RequestMapping("/findUserById")
	public String getUser(String id){
		User user = userService.getUser(id);
		System.out.println(user.toString());
		return "success";
	}
}
