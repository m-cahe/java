package fes_3;

import java.util.Scanner;

public class fes_8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int N = scanner.nextInt();
		int[][] arr = new int[N][N];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = 10 * (i / 2) + j + 1;
					System.out.printf("\t%d ", arr[i][j]);
				} else {
					arr[i][j] = 10 * (i + 1) / 2 - j;
					System.out.printf("\t%d ", arr[i][j]);
				}
				if (j == arr.length - 1) {
					System.out.println();
				}
			}
		}

	}

}
