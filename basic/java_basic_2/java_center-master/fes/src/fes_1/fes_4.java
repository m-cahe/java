package fes_1;

import java.util.Scanner;

public class fes_4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("�� �ݾ� �Է� : ");
		int inputMoney=scanner.nextInt();
		int change=inputMoney;
		System.out.printf("�ܵ� : %d��\n", change);
		int man=change/10000;
		change-=man*10000;
		System.out.printf("10000�� : %d��\n", man);
		int och=change/5000;
		change-=och*5000;
		System.out.printf("5000�� : %d��\n", och);
		int ch=change/1000;
		change-=ch*1000;
		System.out.printf("1000�� : %d��\n", ch);
		int obaek=change/500;
		change-=obaek*500;
		System.out.printf("500�� : %d��\n", obaek);
		int baek=change/100;
		change-=baek*100;
		System.out.printf("100�� : %d��", baek);
		
		

	}

}

