package fes_1;

import java.util.Scanner;

public class fes_5_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = scanner.nextInt();
		int num1 = num / 10;
		double num2 = (double) num % 10 / 10;
		int roundnum = (int) Math.round(num2);
		int finalnum = 10 * (num1 + roundnum);
		System.out.printf("�ݿø� ��� : %d", finalnum);
	}

}
