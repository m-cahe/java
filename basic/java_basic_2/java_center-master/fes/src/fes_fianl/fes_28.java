package fes_fianl;

import java.util.Arrays;

public class fes_28 {

	public static void main(String[] args) {

		// Á¦°ö?

		String str = "00000111";
		int[] str1 = new int[str.length()];
		String[] arr = str.split("");
		for (int i = 0; i < str1.length; i++) {
			str1[i] = Integer.parseInt(arr[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < str1.length; i++) {
			sum += str1[i] * powerN(2, str1.length-1 - i);
		}
		System.out.printf("%s(2) = ", str);
		System.out.printf("%d(10)", sum);

	}

	public static int powerN(int a, int b) {
		int multiple = 1;
		for (int i = 0; i < b; i++) {
			multiple *= a;
		}
		return multiple;
	}
}
