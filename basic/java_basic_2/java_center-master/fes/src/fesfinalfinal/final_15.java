package fesfinalfinal;

import java.util.Scanner;

public class final_15 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.print("n ют╥б : ");
		int n=scanner.nextInt();
		int[] arr= new int [n];
		int sum=1;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			System.out.printf("%d ", sum);
		}

		
	}
}
