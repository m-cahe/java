package fes_fianl;

import java.util.Scanner;

public class fes_22��������2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�� : ");
		int N = sc.nextInt();
		int[] array = new int[N];

		for (int i = 0; i < array.length; i++) {

			System.out.print(i + 1 + "��° �Է�>> ");
			array[i] = sc.nextInt();
		}

		for (int j = array.length - 1; j > 0; j--) {
			int maxIndex = 0;

			for (int i = 0; i <= j; i++) {

				if (array[i] > array[maxIndex]) {
					maxIndex = i;
				}
			}
			int temp = array[j];
			array[j] = array[maxIndex];
			array[maxIndex] = temp;

		}
		System.out.println("������");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}