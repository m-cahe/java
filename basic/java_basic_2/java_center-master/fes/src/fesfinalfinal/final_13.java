package fesfinalfinal;

import java.util.Scanner;

public class final_13 {

	public static void main(String[] args) {

		int input = 8;

		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}

	}

	public static int fibo(int n) {
		int result = 0;
		if (n == 1) {
			result = 1;
			return result;
		} else if (n == 2) {
			result = 1;
			return result;
		} else {
			result = fibo(n - 1) + fibo(n - 2);
			return result;
		}

		
	}
}
