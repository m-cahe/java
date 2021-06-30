import java.util.Random;
import java.util.Scanner;

public class ex_08 {

	public static void main(String[] args) {

		System.out.print("==Plus Game==\n");
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int num1 = 0;
		String answer = "";
		do {
			num = random.nextInt(100) + 1;
			num1 = random.nextInt(100) + 1; // Math.random 이랑 Random random=new Random() 기능 거의 같다
			System.out.printf("%d + %d = ", num, num1);
			int sum = scanner.nextInt();
			if (sum == (num + num1)) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");
			}
			System.out.print("계속하시겠습니까? (Y/N) ");
			answer = scanner.next();
			if (answer.equals("N")) {
				break;
			} else if (!answer.equals("N") && !answer.equals("Y")) {
				System.out.println("이해하지 못합니다.");
				break;
			}
		} while (answer.equals("Y"));

		System.out.println("프로그램이 종료되었습니다.");
	}

}
