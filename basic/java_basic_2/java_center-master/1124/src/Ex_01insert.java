import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_01insert {
	public static void main(String[] args) {

		PreparedStatement psmt = null;
		Connection conn = null;

		// 1. 동적 로딩(드라이버 로딩)
		// 1-1. ojdbc6.jar 파일 추가 buildpath -> configure buildpath
		// db jdbc에서 ojdbc6.jar 파일 추가
		// 1-2 Class.forName() 경로지정

		// java예외처리
		// try{실행문장}catch클래스타입 변수명){에러 발생시 실행되는 문장}
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			// 2. DB연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";// 주소, @뒤에 localhost 해도됨, 포트번호(1521)
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("DataBase접속 성공");
			} else {
				System.out.println("DataBase 접속 실패");
			}

			// 3. SQL문장 실행
			String sql = "insert into smart values('suzy', '1010')";
			psmt = conn.prepareStatement(sql);
			int cnt = psmt.executeUpdate();// C, U, D 행이 변하는거 사용할때 사용 cnt는 변하는 행의 갯수 리턴
//			psmt.executeQuery();//행 안변하는거 사용할때 사용(select)
			if (cnt > 0) {
				System.out.println("회원가입 성공");
			} else {
				System.out.println("회원가입 실패");
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DataBase 접속 실패");
		} finally {
			// finally는 try문이 실행되든 catch문이 실행되든
			// 무조건 finally 마지막에 실행됨
			// finally 코드작성과 전역변수로 빼는 작업
			// 4. 닫기(데이터베이스 자원반납)
			// 역순으로

			try {
//				1. psmt 닫기
				if (psmt != null) {
					// null인 경우 close작업 진행하면 NullPointerException 오류뜸
					psmt.close();// null이 아닐떄만, 즉 생성이 되었을때만
				}
				// conn 닫기
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

	}
}
