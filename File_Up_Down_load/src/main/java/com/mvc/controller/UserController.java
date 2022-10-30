package com.mvc.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.model.User;
import com.mvc.service.UserService;


@RestController
public class UserController {

	@Autowired
	UserService service;
	
	
}
