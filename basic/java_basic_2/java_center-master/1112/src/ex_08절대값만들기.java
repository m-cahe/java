import java.util.Scanner;

public class ex_08���밪����� {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("ù ��° ���� �Է� : ");
		int num1 = scanner.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = scanner.nextInt();
		int result = getAbsoluteValue(num1, num2);
		System.out.println("��� Ȯ�� : " + result);
	}

	public static int getAbsoluteValue(int n, int m) {
		int result = 0;
		result = (n > m) ? n - m : m - n;
		if (n == m) {
			result = 0;
		}
		return result;
	}

}
