package com.mvc.service;

import java.util.List;

import com.file.model.FileInfoDto;
import com.mvc.model.User;

public interface UserService {
	User login(User user);

	void fileupload(User user);

	List<FileInfoDto> userFile(User result);

}
