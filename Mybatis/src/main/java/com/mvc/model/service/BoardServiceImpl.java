package com.mvc.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.model.mapper.BoardMapper;
import com.mvc.model.vo.Board;
//BoardService인터페이스 안의 메소드를 구현한 객체
//Controller에게서 들어온 요청을 처리하는 객체
//DAO에게 요청을 넘김


@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardMapper mapper;//interface type

	@Override
	public ArrayList<Board> selectAll() {		
		return mapper.selectAll();
	}

	@Override
	public void insert(Board b) {
		mapper.insert(b);
	}

	@Override
	public int delete(int num) {
		
		return mapper.delete(num);
	}

}
