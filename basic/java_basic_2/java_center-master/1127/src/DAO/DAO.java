package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.insertVO;

public class DAO {
//dao database access object
	// db 연결을 관리하는 객체
	// JDBC 코드
	// 1. 회원가입 기능을 가지는 JDBC 코드를 메소드로 구현
	// 리턴 타입이 인트인 이유는 영향을 받은 행의 개수를 돌려줄거기 때문에
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	private void getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void getClose() {

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

	public int insert(insertVO vo) {
		/*
		 * 1. 드라이버 동적로딩 2. connection 객체연결 3. sql문 작성 4. 작성한sql 전달할 preparedStatement 5.
		 * 매개변수로 받아오는 id, pw, name, age를 smartmember 테이블 추가 종료
		 */
		int result = 0;

		try {
			getConnect();
			String sql = "insert into smartmember values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());
			// 실행필수!!!
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return result;
	}

	public String login(insertVO vo) {
		/*
		 * 1. 드라이버 동적로딩 2. connection 객체연결 3. sql문 작성 4. 작성한sql 전달할 preparedStatement 5.
		 * 매개변수로 받아오는 id, pw, name, age를 smartmember 테이블 추가 종료
		 */
		String result = "";

		try {
			getConnect();
			String sql = "select name from smartmember where id =? and pw=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			rs = psmt.executeQuery();
			if (rs.next()) {
				result = rs.getString(1);
				JOptionPane.showMessageDialog(null, "안녕하세요!! " + result + "님!!", "환영합니다",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "실패!!!", "실패입니다", JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return result;
	}

	public int withDrawal(insertVO vo) {
		int result = 0;
		try {
			getConnect();
			String sql = "delete from smartmember where id=? and pw=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			// 실행필수!!!
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return result;
	}

	public ArrayList<insertVO> allSelect() {
		ArrayList<insertVO> list=new ArrayList<insertVO>();
		try {
			getConnect();
			String sql = "select * from smartmember";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				String id= rs.getString(1);
				String pw= rs.getString(2);
				String name= rs.getString(3);
				int age= rs.getInt(4);
				insertVO vo= new insertVO(id, pw, name, age);
				list.add(vo);
			}
			//메소드 리턴 딱 한번만
			//vo 데이터 하나로 묶어서 관리할수있는 방법은?
			//가변배열
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return list;
		
	}
}
