

import java.util.Scanner;

public class aaaa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int num = scanner.nextInt();

		// 소수는 0,1 은 해당되지 않으므로 2부터 시작
		System.out.printf("%d = ", num);
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.printf("%d", i);
				if (num != i) {
					System.out.print("*");
				}
				num = num / i;

			}
		}
		scanner.close();
	}

}
