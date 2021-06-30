import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_02deltete {
	public static void main(String[] args) {
		PreparedStatement psmt = null;
		Connection conn = null;
		// jdbc �������
		// 1. ���� ���ε�(�����ε��̶� ������)

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ��ü���� ������Ÿ���� �������ص� �����ϴ� ���� ��Ÿ���� �������ִ� ���
//			classnotfoundexception
			// 1.forname�ȿ� �ִ� ���ڿ��� ��Ÿ�� �ִ��� Ȯ��
			// 1-2. ojdbc6.jar ���� �� ������Ʈ���־����� Ȯ��
			// 2. DB ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			// 2-1 connection ��ü ����
			conn = DriverManager.getConnection(url, user, password);

			// 2-2sql���� ����
			String sql = "delete from smart where id='suzi'";
			// 2-3 preparestatement ��ü ����
			psmt = conn.prepareStatement(sql);
			// 3. ����
			int cnt = psmt.executeUpdate();
			System.out.println("������ ���� ���� ���� : " + cnt);
			if (cnt > 0) {
				System.out.println("���� ���� ����!~");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 4. �ݱ�
		finally {
			// 1.psmt �ݱ� 2. conn�ݱ�

			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
