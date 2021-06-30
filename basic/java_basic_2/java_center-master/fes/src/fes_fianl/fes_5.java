package fes_fianl;

import java.util.Scanner;

public class fes_5 {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Çà °³¼ö : ");
		int i = scanner.nextInt();
		for (int line = 1; line <= i; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		scanner.close();

	}

}
