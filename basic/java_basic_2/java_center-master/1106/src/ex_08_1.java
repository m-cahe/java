import java.util.Scanner;

public class ex_08_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���ĺ� : ");
		String firstAlpha = scanner.next();
		System.out.print("������ ���ĺ� : ");
		String finalAlpha = scanner.next();
		char first = firstAlpha.charAt(0);
		char final1 = finalAlpha.charAt(0);
		for (int i = 0; i <= 25; i++) {

			if ((char) ('a' + i) < first || final1 < (char) ('a' + i)) {
				continue;
			}
			System.out.print((char) ('a' + i) + " ");
		}

	}

}
