import java.util.Scanner;

import com.Model.SmartDAO;
import com.Model.SmartDTO;

public class Main {
	public static void main(String[] args) {
		//이게 view
		Scanner sc = new Scanner(System.in);
		System.out.println("=====회원가입 프로그램=====");
		System.out.println("id, pw >> ");
		SmartDTO dto = new SmartDTO(sc.next(), sc.next());
		SmartDAO dao = new SmartDAO();
		int cnt = dao.insert(dto);
		if (cnt > 0) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}
}
