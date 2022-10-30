package com.mvc.mapper;

import java.util.List;

import com.file.model.FileInfoDto;
import com.mvc.model.User;

public interface UserMapper{
	User login(User user);

	void fileupload(User user);
	FileInfoDto userinfo(String id);
	List<FileInfoDto> userFile(User user);
}
