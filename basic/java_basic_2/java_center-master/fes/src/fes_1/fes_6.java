package fes_1;

import java.util.Scanner;

public class fes_6 {

	public static void main(String[] args) {
//		�ִ� �����&�ּ� �����
//  n*m= �ִ�����*�ּҰ���� ���� �̿�;
// n=ga, m=gb l=gab(a,b ���μ�) nm=gagb=ggab=gl

		Scanner scanner = new Scanner(System.in);
		System.out.print("�ִ� �����&�ּ� ����� ���ϱ�\n");
		System.out.print("����1 �Է�>> ");
		int num1 = scanner.nextInt();
		System.out.print("����2 �Է�>> ");
		int num2 = scanner.nextInt();
		int g = 0;// �ִ����� g��0�� �Ǹ� �ȵȴ�.
		int beforeL = num1 * num2;// �ּҰ���� ����
		// ��Ŭ���� ȣ����
		if (num1 > num2) {
			while (num2 != 0) {
				int i = num1 % num2;// i�� num1�� num2�� ���� ������
				if (i == 0) {
					g = num2;
					break;
				}
				num1 = num2;
				num2 = i;
			}

		} else if (num2 > num1) {
			while (num1 != 0) {
				int i = num2 % num1;// i�� num1�� num2�� ���� ������
				if (i == 0) {
					g = num1;
					break;
				}
				num2 = num1;
				num1 = i;
			}
		}
		System.out.printf("�ִ����� : %d\n", g);
		int l = beforeL / g;// �ּҰ����
		System.out.printf("�ּҰ���� : %d", l);

	}

}
