package com.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SmartDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("DataBase 연결 성공");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insert(SmartDTO dto) {
		connect();
		int cnt = 0;
		try {
			String sql = "insert into smart values(?,?)";
			//자바에서 던질때 이게 문자다 해주면 db에서 알아서 이게 문자구나 하고 '' 넣음
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return cnt;

	}

}
