package fesfinalfinal;

import java.util.Random;
import java.util.Scanner;

public class final_23 {

	public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
int N=scanner.nextInt();
		int cnt=1;
		int[][] arr=new int [N][N];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=cnt;
				cnt++;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
