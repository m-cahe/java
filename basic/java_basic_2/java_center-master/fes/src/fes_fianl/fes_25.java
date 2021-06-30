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

		// 1. 입력 2 대쉬 총 개수
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String numString = scanner.next();
		String[] numarr = numString.split("");
		// String자료형이 가지고 있는 기능중에 한글자씩 끊어서
//		배열 형태로 돌려주는 기능 split("");

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
		System.out.printf("대시의 총합 : %d", sum);
	}

}
