package fes_fianl;

import java.util.Scanner;

public class fes_22선택정렬 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[5];

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 수 입력 : ", i + 1);
			arr[i] = scanner.nextInt();
		}
		for (int j = 4; j > 0; j--) {
			int maxIndex = 0;
			for (int i = 0; i <= j; i++) {
				if (arr[i] > arr[maxIndex]) {
					maxIndex = i;
				}

			}
			temp = arr[j];
			arr[j] = arr[maxIndex];
			arr[maxIndex] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}