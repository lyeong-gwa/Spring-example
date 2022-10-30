package com.mvc.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.file.model.FileInfoDto;
import com.mvc.model.User;
import com.mvc.service.UserService;


@Controller
public class HomeController {
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession session) {
		User user = (User) session.getAttribute("userinfo");
		if(user!=null) {
			List<FileInfoDto> userFile = service.userFile(user); 
			user.setFileInfos(userFile);
			session.setAttribute("userinfo", user);
		}
		return "home";
	}
	
	
	
	
	
	
	@PostMapping(value = "/login")
	public String login(User user,HttpSession session) {
		User result = service.login(user);
		if(result!=null) {
			result.setFileInfos(service.userFile(result));
			System.out.println(result.getFileInfos());
			session.setAttribute("userinfo", result);
			
		}
		return "home";
	}
	
	@PostMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("userinfo");
		return "home";
	}
}
