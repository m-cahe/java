package fesfinalfinal;

import java.util.Scanner;

public class final_26 {

	public static void main(String[] args) {

		System.out.print(caesar("a B z", 4));

	}

	public static String caesar(String a, int n) {
		String[] arr = a.split(" ");
		char[] arr1 = new char[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (char) (arr[i].charAt(0) + n);
			if (arr[i].charAt(0) == 'z') {
				arr1[i] = (char) ('a' + (n - 1));
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		return "";
	}

}
