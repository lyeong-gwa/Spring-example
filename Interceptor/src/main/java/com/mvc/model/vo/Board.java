package com.mvc.model.vo;
//board 테이블의 레코드 한 건의 정보를 저장하기 위한 클래스

public class Board {
	private int num;
	private String content;
	private int count;

	public Board() {
	}

	public Board(int num, String content, int count) {
		super();
		this.num = num;
		this.content = content;
		this.count = count;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	

}
