package fes_fianl;

import java.util.Scanner;

public class fes_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ִ� �����&�ּ� ����� ���ϱ�\n");
		System.out.print("����1 �Է�>> ");
		int num1 = scanner.nextInt();
		System.out.print("����2 �Է�>> ");
		int num2 = scanner.nextInt();
		int min=0;
		int g=0;
		if (num1>num2) {
			min=num2;
		}
		else {
			min=num1;
		}
		//num1�� num2�� min���� 1�� ���鼭 ������ �ϴ�  ���� ���� ū �� ã��
		for (int i=min;i>1;i--) {
			if(num1%i==0&&num2%i==0) {
				g=i;
				break;
			}
		}
		System.out.printf("�ִ� ����� : %d\n", g);
		int l=num1*num2/g;
		System.out.printf("�ּ� ����� : %d", l);

	}

}
