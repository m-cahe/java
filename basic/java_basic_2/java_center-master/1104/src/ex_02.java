import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {

		// ���� �ϳ� �󱸰� 5�� ���� �󱸰� 23����� ������ ������?

		Scanner scanner = new Scanner(System.in);
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int number = scanner.nextInt();
		int result = (number % 5 < 5 && number % 5 != 0) ? number / 5 + 1 : number / 5;
		// �������� �ֳ� ���ķ� ������ �Ǵϱ� ���� ���� �´�
		int result1 = (number % 5 == 0) ? number / 5 : number / 5 + 1;
		System.out.println("�ʿ��� ������ �� : " + result);
		System.out.println("�ʿ��� ������ �� : " + result1);

	}

}
