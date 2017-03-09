package com.lql.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lql.spring.entity.User;
import com.lql.spring.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/success")
	public String addUser(HttpServletRequest request, HttpServletResponse response) {
		User user = new User("lql", "qinglong", "123");
		userService.addUser(user);
		return "success";
	}
}
