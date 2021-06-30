import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_01insert {
	public static void main(String[] args) {

		PreparedStatement psmt = null;
		Connection conn = null;

		// 1. ���� �ε�(����̹� �ε�)
		// 1-1. ojdbc6.jar ���� �߰� buildpath -> configure buildpath
		// db jdbc���� ojdbc6.jar ���� �߰�
		// 1-2 Class.forName() �������

		// java����ó��
		// try{���๮��}catchŬ����Ÿ�� ������){���� �߻��� ����Ǵ� ����}
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			// 2. DB����
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";// �ּ�, @�ڿ� localhost �ص���, ��Ʈ��ȣ(1521)
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("DataBase���� ����");
			} else {
				System.out.println("DataBase ���� ����");
			}

			// 3. SQL���� ����
			String sql = "insert into smart values('suzy', '1010')";
			psmt = conn.prepareStatement(sql);
			int cnt = psmt.executeUpdate();// C, U, D ���� ���ϴ°� ����Ҷ� ��� cnt�� ���ϴ� ���� ���� ����
//			psmt.executeQuery();//�� �Ⱥ��ϴ°� ����Ҷ� ���(select)
			if (cnt > 0) {
				System.out.println("ȸ������ ����");
			} else {
				System.out.println("ȸ������ ����");
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DataBase ���� ����");
		} finally {
			// finally�� try���� ����ǵ� catch���� ����ǵ�
			// ������ finally �������� �����
			// finally �ڵ��ۼ��� ���������� ���� �۾�
			// 4. �ݱ�(�����ͺ��̽� �ڿ��ݳ�)
			// ��������

			try {
//				1. psmt �ݱ�
				if (psmt != null) {
					// null�� ��� close�۾� �����ϸ� NullPointerException ������
					psmt.close();// null�� �ƴҋ���, �� ������ �Ǿ�������
				}
				// conn �ݱ�
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

	}
}
