import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int grade = scanner.nextInt();
		String result = "";
		if (grade >= 60) {
			result = "�հ�";
			System.out.printf("%s�Դϴ�", result);
		} else {
			result = "���հ�";
			System.out.printf("%s�Դϴ�", result);
		}

		System.out.print("\n���� �Է� : ");
		int num = scanner.nextInt();
		String result1 = "";
		if (num % 2 == 0) {
			result1 = "¦��";
			System.out.printf("%d�� %s�Դϴ�", num, result1);
		} else {
			result1 = "Ȧ��";
			System.out.printf("%d�� %s�Դϴ�", num, result1);
		}

	}

}
