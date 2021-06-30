package fesfinalfinal;

import java.util.Scanner;

public class final_28 {

	public static void main(String[] args) {
		System.out.println(powerN(2, 3));
		String str = "00101000";
		System.out.print(binarDec(str));

	}

	public static int binarDec(String a) {
		String[] arr = a.split("");
		int[] arr1 = new int[arr.length];
		int result = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(arr[i]);
		}
		for (int i = 0; i < arr1.length; i++) {
			result += arr1[i] * powerN(2, arr1.length - 1 - i);
		}

		return result;
	}

	public static int powerN(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}

}
