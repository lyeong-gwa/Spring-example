package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.file.model.FileInfoDto;
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

	@Override
	public void fileupload(User user) {
		mapper.fileupload(user);
	}

	@Override
	public List<FileInfoDto> userFile(User user) {
		return mapper.userFile(user);
	}
	
}
