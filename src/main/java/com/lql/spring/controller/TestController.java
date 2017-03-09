package com.lql.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lql.spring.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestService testService;
	@ResponseBody
	@RequestMapping("/helloworld")
	public String helloWorld(HttpServletResponse response, HttpServletRequest request) {
		return testService.getHelloStr();

	}

	@RequestMapping("/index")
	public String index(HttpServletResponse response, HttpServletRequest request) {
		return "index";

	}

}
