package fes_fianl;

import java.util.Scanner;

public class fes_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = scanner.nextInt();
		int n = num % 10;

		for (int i = 0; i <= 9; i++) {
			if (i >= 5) {
				if (n == i) {
					num += 10 - n;
					System.out.printf("�ݿø� ��� : %d", num);
				}
			} else {
				if (n == i) {
					num -= n;
					System.out.printf("�ݿø� ��� : %d", num);
				}
			}
		}

	}

}