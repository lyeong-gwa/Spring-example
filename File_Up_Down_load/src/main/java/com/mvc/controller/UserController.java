package com.mvc.controller;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.file.model.FileInfoDto;
import com.mvc.model.User;
import com.mvc.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@Autowired
	private ServletContext servletContext;
	
	@PostMapping(value = "/fileUpload")
	public String fileUpload(HttpSession session,@RequestParam("upfile") MultipartFile[] files) throws IllegalStateException, IOException {
		User user = (User)session.getAttribute("userinfo");
		
		if (!files[0].isEmpty()) {
			String realPath = servletContext.getRealPath("/upload");
			String today = new SimpleDateFormat("yyMMdd").format(new Date());
			String saveFolder = realPath + File.separator + today;
			File folder = new File(saveFolder);
			if (!folder.exists())
				folder.mkdirs();
			List<FileInfoDto> fileInfos = new ArrayList<FileInfoDto>();
			for (MultipartFile mfile : files) {
				FileInfoDto fileInfoDto = new FileInfoDto();
				String originalFileName = mfile.getOriginalFilename();
				if (!originalFileName.isEmpty()) {
					String saveFileName = UUID.randomUUID().toString()
							+ originalFileName.substring(originalFileName.lastIndexOf('.'));
					fileInfoDto.setSaveFolder(today);
					fileInfoDto.setOriginalFile(originalFileName);
					fileInfoDto.setSaveFile(saveFileName);
					mfile.transferTo(new File(folder, saveFileName));
				}
				fileInfos.add(fileInfoDto);
			}
			user.setFileInfos(fileInfos);
			service.fileupload(user);
		}
		
		
		return "home";
	}
	
	@GetMapping(value = "/download")
	public ModelAndView downloadFile(@RequestParam("sfolder") String sfolder, @RequestParam("ofile") String ofile,
			@RequestParam("sfile") String sfile, HttpSession session) {
		User user = (User) session.getAttribute("userinfo");
		if (user != null) {
			System.out.println("다운시작");
			Map<String, Object> fileInfo = new HashMap<String, Object>();
			fileInfo.put("sfolder", sfolder);
			fileInfo.put("ofile", ofile);
			fileInfo.put("sfile", sfile);

			return new ModelAndView("fileDownLoadView", "downloadFile", fileInfo);
		} else {
			return new ModelAndView("redirect:/");
		}
	}
	
	
}
