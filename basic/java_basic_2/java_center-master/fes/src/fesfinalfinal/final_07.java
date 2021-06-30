package fesfinalfinal;

import java.util.Scanner;

public class final_07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Çà °³¼ö : ");
		int row = scanner.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = row; j >i ; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
