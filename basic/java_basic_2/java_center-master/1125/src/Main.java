import java.util.Scanner;

import com.Model.SmartDAO;
import com.Model.SmartDTO;

public class Main {
	public static void main(String[] args) {
		//�̰� view
		Scanner sc = new Scanner(System.in);
		System.out.println("=====ȸ������ ���α׷�=====");
		System.out.println("id, pw >> ");
		SmartDTO dto = new SmartDTO(sc.next(), sc.next());
		SmartDAO dao = new SmartDAO();
		int cnt = dao.insert(dto);
		if (cnt > 0) {
			System.out.println("ȸ������ ����");
		} else {
			System.out.println("ȸ������ ����");
		}
	}
}
