package fes_fianl;

import java.util.Scanner;

public class fes_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int hour = scanner.nextInt();
		int wagehour = 5000;
		int extrahour = 0;
		int pay = 0;
		if (hour > 8) {
			extrahour = hour - 8;
			hour -= extrahour;
			pay = (int) (hour * wagehour + extrahour * 1.5 * wagehour);
			System.out.printf("�� �ӱ��� %d�� �Դϴ�.", pay);
		} else {
			pay = wagehour * hour;
			System.out.printf("�� �ӱ��� %d�� �Դϴ�.", pay);
		}


	}

}
