import java.util.Random;
import java.util.Scanner;

public class ex_08_1 {

	public static void main(String[] args) {

		System.out.print("==Plus Game==\n");
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int num1 = 0;
		String answer = "";
		do {
			num = (int) (Math.random() * 100 + 1); //1~100���� ����
			num1 = (int) (Math.random() * 100 + 1); //do�ȿ� �ؾ� �ݺ��Ҷ����� ���ο� �� ����
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
