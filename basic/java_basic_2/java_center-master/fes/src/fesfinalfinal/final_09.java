package fesfinalfinal;

import java.util.Scanner;

public class final_09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자1 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("숫자2 입력 : ");
		int num2 = scanner.nextInt();
		int g=1;
		int l = 0;
		int min = (num1 > num2) ? num2 : num1;
		for (int i = min; i > 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				g = i;
				break;
			}

		}
		System.out.printf("최대 공약수 : %d", g);
		l=num1*num2/g;
		System.out.printf("\n최대 공약수 : %d", l);
	}

}
