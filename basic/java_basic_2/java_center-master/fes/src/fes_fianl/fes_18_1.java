package fes_fianl;

import java.util.Scanner;

public class fes_18_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int N = scanner.nextInt();
		int[][] arr = new int[N][N];

		System.out.println("���� : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = arr.length * i + j + 1;
				System.out.printf("\t%d", arr[i][j]);
				if (j == arr.length - 1) {
					System.out.println();
				}
			}
		}

		System.out.println("������� : ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i % 2 == 0) {

					System.out.printf("\t%d ", arr[i][j]);
				} else {

					System.out.printf("\t%d ", arr[i][N - 1 - j]);
				}

			}
			System.out.println();
		}

	}

}
