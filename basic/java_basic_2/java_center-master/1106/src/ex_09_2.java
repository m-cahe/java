import java.util.Scanner;

public class ex_09_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("�ܼ� �Է� : ");
		int dan = scanner.nextInt();
		System.out.print("��� ������ �Է� : ");
		int num = scanner.nextInt();
		int i = 0;
		int result = 0;
		System.out.printf("%d��\n", dan);
		for (i = 1; i <= num; i++) {
			result = num * i;
			System.out.printf("%d*%d=%d\n", dan, i, result);
		}

	}

}
