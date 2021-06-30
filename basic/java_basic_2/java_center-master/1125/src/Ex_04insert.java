import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_04insert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;

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
			System.out.println("=====회원가입=====");
			System.out.print("id를 입력하세요 >> ");
			String id = sc.next();
			System.out.print("pw를 입력하세요 >> ");
			String pw = sc.next();
			String str = String.format("insert into smart values('%s', '%s')", id, pw);
			String sql = str;
			//String sql = "insert into smart values(?, ?)";
			psmt = conn.prepareStatement(sql);
			//psmt.setString(1, id);
			//psmt.setString(2, pw);

			int cnt = psmt.executeUpdate();
			if (cnt != 0) {
				System.out.println("입력 성공");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// 4. 종료
		finally {
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
