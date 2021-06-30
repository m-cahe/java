import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex_03select {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			// 1. 동적 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("DataBase 연결 성공");
			}
			// 3. sql 문장 실행
			String sql = "select * from smart";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			System.out.println("====회원정보====");
			System.out.println("id\tpw");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t" + rs.getString(2) + "\n");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		// 4. 종료
		finally {
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
