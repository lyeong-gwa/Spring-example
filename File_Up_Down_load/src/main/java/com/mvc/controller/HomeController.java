package com.mvc.controller;


import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.model.User;
import com.mvc.service.UserService;


@Controller
public class HomeController {
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	
	
	
	
	
	@PostMapping(value = "/login")
	public String login(User user,HttpSession session) {
		User result = service.login(user);
		if(result!=null) {
			session.setAttribute("id", result.getId());
			session.setAttribute("password", result.getPassword());
		}
		return "home";
	}
	
	@PostMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("id");
		session.removeAttribute("password");
		return "home";
	}
}
