package com.mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.mvc.model.vo.Board;
import com.mvc.util.DBUtil;
//BoardDAO 인터페이스 안의 메소드를 구현한 객체
//Service객체에게서 들어온 요청을 최종적으로 처리
//DB 작업을 수행(CRUD)

@Repository // dao작업하는 아이
public class BoardDAOImpl implements BoardDAO {
	DBUtil util;// connection 얻기...

	public BoardDAOImpl() {
		util = DBUtil.getInstance();
	}

	@Override
	public ArrayList<Board> selectAll() {
		String q = "select num, content, count from board";
		ArrayList<Board> list = new ArrayList<Board>();

		try {
			Connection con = util.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);
			while (rs.next()) {
				int num = rs.getInt(1);
				String content = rs.getString(2);
				int count = rs.getInt(3);

				Board b = new Board(num, content, count);
				list.add(b);
			}

			util.close(rs, stat, con);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void insert(Board b) {
		String q = "insert into board(content,count) " + " values(?,?) ";
		int x = 0;
		try {
			Connection con = util.getConnection();
			PreparedStatement stat = con.prepareStatement(q);
			stat.setString(1, b.getContent());
			stat.setInt(2, b.getCount());
			x = stat.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int delete(int num) {
		String q = "delete from board where num =?";
		int x = 0;

		try {
			Connection con = util.getConnection();
			PreparedStatement stat = con.prepareStatement(q);
			stat.setInt(1, num);

			x = stat.executeUpdate();

			util.close(stat, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}

}
