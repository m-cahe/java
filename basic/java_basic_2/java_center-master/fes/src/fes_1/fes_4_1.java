package fes_1;

import java.util.Scanner;

public class fes_4_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] unit = { 10000, 5000, 1000, 500, 100 };// ȯ���� ���� ����
		System.out.print("�� �ݾ� �Է� : ");
		int inputMoney = scanner.nextInt();
		int change = inputMoney;
		System.out.printf("�ܵ� : %d��\n", change);
		for (int i = 0; i < unit.length; i++) {
			int n = change / unit[i];
			change -= n * unit[i];
			System.out.printf("%d�� : %d��\n", unit[i], n);
		}

	}

}
