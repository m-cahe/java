package fes_fianl;

import java.util.Scanner;

public class fes_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("n �Է� : ");
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
