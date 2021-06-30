package fesfinalfinal;

import java.util.Scanner;

public class final_04 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("ÃÑ ±İ¾× ÀÔ·Â : ");
		int input=scanner.nextInt();
		int[] arr= {10000,5000,1000,500,100};
		int[] num=new int [5];
		int change=input;
		System.out.println("ÀÜµ· : "+change+"¿ø");
		for (int i = 0; i < arr.length; i++) {
			num[i]=change/arr[i];
			change-=num[i]*arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d¿ø : %d°³\n", arr[i], num[i]);
		}
	}

}
