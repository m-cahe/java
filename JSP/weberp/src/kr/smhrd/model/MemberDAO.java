package kr.smhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
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
		} catch (ClassNotFoundException e) {
			System.out.println("연결 실패");
		} catch (SQLException e) {
			System.out.println("sql 실패 1");
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
			System.out.println("닫기 실패");
		}
	}

	public int memberInsert(MemberVO vo) {
		getConnect();
		int result = -1;
		String sql = "insert into tblMember values(num_seq.nextval,?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getTel());
			psmt.setString(5, vo.getEmail());
			psmt.setString(6, vo.getAddr());
			result = psmt.executeUpdate();
			getClose();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

	public ArrayList<MemberVO> memberAllList() {

		ArrayList<MemberVO> list = new ArrayList<MemberVO>();

		try {
			getConnect();
			String sql = "select * from tblMember";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				int num = rs.getInt(1);
				String id = rs.getString(2); // 정수로 첫번째 칼럼 가져오겠다.
				String pw = rs.getString(3);
				String name = rs.getString(4);
				String tel = rs.getString(5);
				String email = rs.getString(6);
				String addr = rs.getString(7);

				MemberVO vo = new MemberVO(num, id, pw, name, tel, email, addr); // 가로행 하나만 담겼다!
				list.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return list;
	}

	public int memberDelete(String num) {
		getConnect();
		int result = -1;
		String sql = "delete from tblMember where num=?";
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

	public MemberVO memberContent(int num) {
		MemberVO vo = new MemberVO();
		getConnect();
		String sql = "select * from tblMember where num=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);

			rs = psmt.executeQuery();
			while (rs.next()) {
				num = rs.getInt(1);
				String id = rs.getString(2); // 정수로 첫번째 칼럼 가져오겠다.
				String pw = rs.getString(3);
				String name = rs.getString(4);
				String tel = rs.getString(5);
				String email = rs.getString(6);
				String addr = rs.getString(7);

				vo = new MemberVO(num, id, pw, name, tel, email, addr); // 가로행 하나만 담겼다!

			}
			getClose();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;

	}

	public int memberUpdate(MemberVO vo) {
		getConnect();
		int result = -1;
		String sql = "update tblMember set tel=?, email=?, addr=? where num=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTel());
			psmt.setString(2, vo.getEmail());
			psmt.setString(3, vo.getAddr());
			psmt.setInt(4, vo.getNum());
			result = psmt.executeUpdate();
			getClose();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}
}
