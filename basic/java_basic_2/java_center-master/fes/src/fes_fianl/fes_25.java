package fes_fianl;

import java.util.Arrays;
import java.util.Scanner;

public class fes_25 {

	public static void main(String[] args) {
		// 0 6,9 -6
		// 1 -2
		// 2,3,5 -5
		// 4 -4
		// 7 -3
		// 8 -7

		// 1. �Է� 2 �뽬 �� ����
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		String numString = scanner.next();
		String[] numarr = numString.split("");
		// String�ڷ����� ������ �ִ� ����߿� �ѱ��ھ� ���
//		�迭 ���·� �����ִ� ��� split("");

		int sum = 0;
		for (int i = 0; i < numarr.length; i++) {
			switch (numarr[i]) {
			case "0":
			case "6":
			case "9":
				sum += 6;
				break;
			case "1":
				sum += 2;
				break;
			case "2":
			case "3":
			case "5":
				sum += 5;
				break;
			case "4":
				sum += 4;
				break;
			case "7":
				sum += 3;
				break;
			case "8":
				sum += 7;
				break;
			}
		}
		System.out.printf("����� ���� : %d", sum);
	}

}
