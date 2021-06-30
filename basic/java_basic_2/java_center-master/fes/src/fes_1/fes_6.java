package fes_1;

import java.util.Scanner;

public class fes_6 {

	public static void main(String[] args) {
//		최대 공약수&최소 공배수
//  n*m= 최대공약수*최소공배수 성질 이용;
// n=ga, m=gb l=gab(a,b 서로소) nm=gagb=ggab=gl

		Scanner scanner = new Scanner(System.in);
		System.out.print("최대 공약수&최소 공배수 구하기\n");
		System.out.print("숫자1 입력>> ");
		int num1 = scanner.nextInt();
		System.out.print("숫자2 입력>> ");
		int num2 = scanner.nextInt();
		int g = 0;// 최대공약수 g가0이 되면 안된다.
		int beforeL = num1 * num2;// 최소공배수 이전
		// 유클리드 호제법
		if (num1 > num2) {
			while (num2 != 0) {
				int i = num1 % num2;// i는 num1을 num2로 나눈 나머지
				if (i == 0) {
					g = num2;
					break;
				}
				num1 = num2;
				num2 = i;
			}

		} else if (num2 > num1) {
			while (num1 != 0) {
				int i = num2 % num1;// i는 num1을 num2로 나눈 나머지
				if (i == 0) {
					g = num1;
					break;
				}
				num2 = num1;
				num1 = i;
			}
		}
		System.out.printf("최대공약수 : %d\n", g);
		int l = beforeL / g;// 최소공배수
		System.out.printf("최소공배수 : %d", l);

	}

}
