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
			num1 = random.nextInt(100) + 1; // Math.random �̶� Random random=new Random() ��� ���� ����
			System.out.printf("%d + %d = ", num, num1);
			int sum = scanner.nextInt();
			if (sum == (num + num1)) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");
			}
			System.out.print("����Ͻðڽ��ϱ�? (Y/N) ");
			answer = scanner.next();
			if (answer.equals("N")) {
				break;
			} else if (!answer.equals("N") && !answer.equals("Y")) {
				System.out.println("�������� ���մϴ�.");
				break;
			}
		} while (answer.equals("Y"));

		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
