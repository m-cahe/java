import java.util.Scanner;

public class ex_05_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String id = "";
		String answer = "";
		int pw = 0;
		System.out.print("=====start===== ");
		do {
			System.out.print("\n아이디를 입력하세요 >>");
			id = scanner.next();
			System.out.print("비밀번호를 입력하세요 >>");
			pw = scanner.nextInt();
			if (id.equals("Hello") && pw == 1234) {
				System.out.println("로그인 성공!");
				break;
			}
			System.out.print("아이디와 비밀번호가 잘못되었습니다.\n");
			System.out.print("계속하시겠습니까? (Y/N) ");
			answer = scanner.next();
			if (answer.equals("N")) {
				break;
			} else if (!answer.equals("N") && !answer.equals("Y")) {
				System.out.println("이해하지 못합니다.");
				break;
			}

		} while (answer.equals("Y"));

		System.out.println("\n종료되었습니다.");
		System.out.print("=====finish===== ");
	}

}
