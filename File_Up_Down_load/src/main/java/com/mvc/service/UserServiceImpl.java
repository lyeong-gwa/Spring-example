package com.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.mapper.UserMapper;
import com.mvc.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper mapper;
	
	@Override
	public User login(User user) {
		return mapper.login(user);
	}
	
}
