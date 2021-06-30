package fes_fianl;

import java.util.Scanner;

public class fes_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int hour = scanner.nextInt();
		int wagehour = 5000;
		int extrahour = 0;
		int pay = 0;
		if (hour > 8) {
			extrahour = hour - 8;
			hour -= extrahour;
			pay = (int) (hour * wagehour + extrahour * 1.5 * wagehour);
			System.out.printf("총 임금은 %d원 입니다.", pay);
		} else {
			pay = wagehour * hour;
			System.out.printf("총 임금은 %d원 입니다.", pay);
		}


	}

}
