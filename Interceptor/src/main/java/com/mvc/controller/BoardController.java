package com.mvc.controller;


import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.model.service.BoardService;
import com.mvc.model.service.BoardServiceImpl;
import com.mvc.model.vo.Board;
//FrontController에게서 요청을 넘겨 받아 Service에게 넘김
//나중에 리턴되는 데이터를 받아서 jsp로 넘겨줘야 함

@Controller
public class BoardController {
	@Autowired
	BoardService service;// interface type

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model,HttpServletRequest request) {
		HttpSession session = request.getSession();
		String city = (String)session.getAttribute("city");
		String code = (String)session.getAttribute("code");
		if(city==null &&code==null) {
			city="seoul";
			code="controller";
		}
		model.addAttribute("city",city);
		model.addAttribute("code",code);
		ArrayList<Board> list = service.selectAll();
		model.addAttribute("list",list);
		return "home";//view 이름
	}
	
	//@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@PostMapping(value="insert")
	public String insertProcess(Board b) {//jsp파일에 입력형식만 맞다면 알아서 board를 형성하고 값을 넣는다.
		service.insert(b);
		return "redirect:/";
	}
	
	@GetMapping(value="/delete")
	public String delete(HttpServletRequest req) {
		String num = req.getParameter("num");
		service.delete(Integer.parseInt(num));
		return "redirect:/";
	}

}
