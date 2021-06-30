package fes_2;

import java.util.Scanner;

public class fes_7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("n ют╥б : ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		int sum = 1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.printf("%d ", sum);

		}
		scanner.close();
	}

}
