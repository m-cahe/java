package fesfinalfinal;

import java.util.Scanner;

public class final_12 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("���� �Է�  : ");
		int n=scanner.nextInt();
		int[][] arr=new int[n][n];
		System.out.println("���� : ");
		int cnt=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=cnt;
				cnt++;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("���� �� : ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}
	}

}
