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
	// db ������ �����ϴ� ��ü
	// JDBC �ڵ�
	// 1. ȸ������ ����� ������ JDBC �ڵ带 �޼ҵ�� ����
	// ���� Ÿ���� ��Ʈ�� ������ ������ ���� ���� ������ �����ٰű� ������
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
		 * 1. ����̹� �����ε� 2. connection ��ü���� 3. sql�� �ۼ� 4. �ۼ���sql ������ preparedStatement 5.
		 * �Ű������� �޾ƿ��� id, pw, name, age�� smartmember ���̺� �߰� ����
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
			// �����ʼ�!!!
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
		 * 1. ����̹� �����ε� 2. connection ��ü���� 3. sql�� �ۼ� 4. �ۼ���sql ������ preparedStatement 5.
		 * �Ű������� �޾ƿ��� id, pw, name, age�� smartmember ���̺� �߰� ����
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
				JOptionPane.showMessageDialog(null, "�ȳ��ϼ���!! " + result + "��!!", "ȯ���մϴ�",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "����!!!", "�����Դϴ�", JOptionPane.ERROR_MESSAGE);
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
			// �����ʼ�!!!
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
			//�޼ҵ� ���� �� �ѹ���
			//vo ������ �ϳ��� ��� �����Ҽ��ִ� �����?
			//�����迭
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return list;
		
	}
}
