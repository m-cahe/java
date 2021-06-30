package fes_fianl;

import java.util.Scanner;

public class fes_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("최대 공약수&최소 공배수 구하기\n");
		System.out.print("숫자1 입력>> ");
		int num1 = scanner.nextInt();
		System.out.print("숫자2 입력>> ");
		int num2 = scanner.nextInt();
		int min=0;
		int g=0;
		if (num1>num2) {
			min=num2;
		}
		else {
			min=num1;
		}
		//num1과 num2를 min에서 1씩 뺴면서 나누기 하는  도중 가장 큰 값 찾기
		for (int i=min;i>1;i--) {
			if(num1%i==0&&num2%i==0) {
				g=i;
				break;
			}
		}
		System.out.printf("최대 공약수 : %d\n", g);
		int l=num1*num2/g;
		System.out.printf("최소 공배수 : %d", l);

	}

}
