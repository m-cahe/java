package fesfinalfinal;

import java.util.Random;

public class final_29 {

	public static void main(String[] args) {

		System.out.println("배열에 있는 값");
		Random rand = new Random();
		int[][] arr = new int[8][8];
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = rand.nextInt(99) + 1;
				System.out.print(arr[i][j] + "\t");
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (max == arr[i][j]) {
					System.out.printf("최대값 : %d \n 행 : %d\t열 : %d", max, i, j);
				}
			}
		}
	}

}
