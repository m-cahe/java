package fesfinalfinal;

import java.util.Scanner;

public class final_27 {

	public static void main(String[] args) {

		System.out.print(change124(20));

	}

	public static String change124(int n) {
		String[] arr = { "4", "1", "2" };
		String result = "";
		while (n > 0) {
			result = arr[n % 3] + result;
			n = (n - 1) / 3;
		}

		return result;
	}

}
