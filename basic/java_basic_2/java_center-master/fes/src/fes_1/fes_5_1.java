package fes_1;

import java.util.Scanner;

public class fes_5_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scanner.nextInt();
		int num1 = num / 10;
		double num2 = (double) num % 10 / 10;
		int roundnum = (int) Math.round(num2);
		int finalnum = 10 * (num1 + roundnum);
		System.out.printf("반올림 결과 : %d", finalnum);
	}

}
