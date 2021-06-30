package fesfinalfinal;

import java.util.Scanner;

public class final_06 {

	public static void main(String[] args) {

		int[] arr = new int[77];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[arr.length - 1 - i] * arr[i];
		}
		System.out.println(sum);
	}

}
