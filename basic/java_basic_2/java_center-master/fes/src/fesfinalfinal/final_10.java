package fesfinalfinal;

import java.util.Random;

public class final_10 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		int max = -1;
		int min = 150;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.printf("\n���� ū �� : %d", max);
		System.out.printf("\n���� ���� �� : %d", min);
	}

}
