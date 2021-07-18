package com.saeyan.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	private void getConnect() {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	private void getClose() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<BoardVO> selectAllBoards() {

		List<BoardVO> list = new ArrayList<BoardVO>();

		try {
			getConnect();
			String sql = "select * from board order by num desc";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				BoardVO vo = new BoardVO();

				vo.setNum(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setPass(rs.getString(3));
				vo.setEmail(rs.getString(4));
				vo.setTitle(rs.getString(5));
				vo.setContent(rs.getString(6));
				vo.setReadcount(rs.getInt(7));
				vo.setWritedate(rs.getTimestamp(8));

				list.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return list;
	}

	public int insertBoard(BoardVO vo) {

		getConnect();
		int result = -1;
		String sql = "insert into board(num,name,pass,email,title,content) values(board_seq.nextval,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getPass());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getTitle());
			psmt.setString(5, vo.getContent());
			result = psmt.executeUpdate();
			getClose();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

	public int updateReadCount(String num) {

		getConnect();
		int result = -1;
		String sql = "update board set readcount=readcount+1 where num=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, num);
			result = psmt.executeUpdate();
			getClose();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

	// 게시판 글 상세 내용 보기 : 글번호로 찾아온다. 실패 null;
	public BoardVO selectOneBoardByNum(String num) {

		getConnect();

		BoardVO vo = null;
		String sql = "select * from board where num=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, num);
			rs = psmt.executeQuery();
			if (rs.next()) {
				vo = new BoardVO();

				vo.setNum(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setPass(rs.getString(3));
				vo.setEmail(rs.getString(4));
				vo.setTitle(rs.getString(5));
				vo.setContent(rs.getString(6));
				vo.setReadcount(rs.getInt(7));
				vo.setWritedate(rs.getTimestamp(8));

			}
			getClose();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;

	}

	public int updateBoard(BoardVO vo) {

		getConnect();
		int result = -1;
		String sql = "update board set name=?,pass=?,email=?,title=?, content=? where num=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getPass());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getTitle());
			psmt.setString(5, vo.getContent());
			psmt.setInt(6, vo.getNum());
			result = psmt.executeUpdate();
			getClose();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

	public BoardVO checkPassWord(String pass, String num) {
		getConnect();
		String sql = "select * from board where pass=? and num=?";
		BoardVO vo = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pass);
			psmt.setString(2, num);
			rs = psmt.executeQuery();
			if (rs.next()) {
				vo = new BoardVO();

				vo.setNum(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setPass(rs.getString(3));
				vo.setEmail(rs.getString(4));
				vo.setTitle(rs.getString(5));
				vo.setContent(rs.getString(6));
				vo.setReadcount(rs.getInt(7));
				vo.setWritedate(rs.getTimestamp(8));

			}
			getClose();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;

	}
	
	
	public int deleteBoard(String num) {

		getConnect();
		int result = -1;
		String sql = "delete from board where num=?";
		try {

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, num);
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return result;

	
	}

}
