package fes_fianl;

import java.util.Scanner;

public class fes_22�������� {

	public static void main(String[] args) {
		// �׷��̰� ���������� �ƴѰ�??

		int n = 0;
		int temp = 0;
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d��° �� �Է� : ", i + 1);
			arr[i] = scanner.nextInt();
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}

	}

}
