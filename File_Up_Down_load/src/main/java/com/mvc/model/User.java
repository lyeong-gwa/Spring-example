package com.mvc.model;

import java.util.ArrayList;
import java.util.List;

import com.file.model.FileInfoDto;


public class User {
	private String id;
	private String password;
	private List<FileInfoDto> fileInfos;
	public User() {}
	public User(String id, String password) {
		super();
		this.id = id;
		this.password = password;
		fileInfos = new ArrayList<>();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<FileInfoDto> getFileInfos() {
		return fileInfos;
	}

	public void setFileInfos(List<FileInfoDto> fileInfos) {
		this.fileInfos = fileInfos;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", fileInfos=" + fileInfos + "]";
	}
	
}
