import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {

		// �ΰ� ���� �Է� ū������ ������ ���� ���

		Scanner scanner = new Scanner(System.in);
		System.out.print("ù ���� ���� �Է� : ");
		int num1 = scanner.nextInt();
		System.out.print("�� ���� ���� �Է� : ");
		int num2 = scanner.nextInt();
		int result = (num1 >= num2) ? num1 - num2 : num2 - num1;
		System.out.printf("\t�� ���� �� : %d", result);
		System.out.print("\n\t�� ���� �� : "+ (num1+num2));
	}

}
