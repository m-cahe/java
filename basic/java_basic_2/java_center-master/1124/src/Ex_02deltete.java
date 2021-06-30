import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_02deltete {
	public static void main(String[] args) {
		PreparedStatement psmt = null;
		Connection conn = null;
		// jdbc 연결과정
		// 1. 동적 바인딩(동적로딩이랑 비슷비슷)

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 구체적인 데이터타입을 알지못해도 실행하는 순간 그타입을 결정해주는 기능
//			classnotfoundexception
			// 1.forname안에 있는 문자열에 오타가 있는지 확인
			// 1-2. ojdbc6.jar 파일 을 프로젝트에넣었는지 확인
			// 2. DB 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			// 2-1 connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);

			// 2-2sql구문 생성
			String sql = "delete from smart where id='suzi'";
			// 2-3 preparestatement 객체 생성
			psmt = conn.prepareStatement(sql);
			// 3. 실행
			int cnt = psmt.executeUpdate();
			System.out.println("영향을 받은 행의 갯수 : " + cnt);
			if (cnt > 0) {
				System.out.println("수지 삭제 성공!~");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 4. 닫기
		finally {
			// 1.psmt 닫기 2. conn닫기

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
