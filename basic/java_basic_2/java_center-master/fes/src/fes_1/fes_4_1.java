package fes_1;

import java.util.Scanner;

public class fes_4_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] unit = { 10000, 5000, 1000, 500, 100 };// È¯»êÇÒ µ·ÀÇ Á¾·ù
		System.out.print("ÃÑ ±İ¾× ÀÔ·Â : ");
		int inputMoney = scanner.nextInt();
		int change = inputMoney;
		System.out.printf("ÀÜµ· : %d°³\n", change);
		for (int i = 0; i < unit.length; i++) {
			int n = change / unit[i];
			change -= n * unit[i];
			System.out.printf("%d¿ø : %d°³\n", unit[i], n);
		}

	}

}
