package fes_fianl;

import java.util.Scanner;

public class fes_20_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int n = scanner.nextInt();
		String[] num = { "0 ", "1 " };
		String result = " ";
		while (n > 0) {
			result = num[n % 2] + result;
			n /= 2;
		}
		System.out.print("2진수 표현 : ");
		System.out.println(result);
		scanner.close();
	}

}
