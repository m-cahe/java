package fes_fianl;

import java.util.Scanner;

public class fes_19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
		int num = scanner.nextInt();

		// �Ҽ��� 0,1 �� �ش���� �����Ƿ� 2���� ����
		System.out.printf("%d = ", num);
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.printf("%d", i);
				if (num != i) {
					System.out.print("*");
				}
				num = num / i;

			}
		}
		scanner.close();
	}

}
