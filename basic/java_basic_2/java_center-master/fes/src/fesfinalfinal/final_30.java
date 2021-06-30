package fesfinalfinal;

import java.util.Random;
import java.util.Scanner;

public class final_30 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("배열의 크기 : ");
		int N=scanner.nextInt();
		int[][] arr = new int[N][N];
		int cnt = 1;
		int start = (arr.length-1)/2;
		int end = (arr.length-1)/2;
		for (int i = 0; i < arr.length; i++) {
			for (int j = start; j <= end; j++) {
				arr[i][j] = cnt;
				cnt++;

			}
			if (i < (arr.length-1)/2) {
				start--;
				end++;
			} else {
				start++;
				end--;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}

		
		
		
	}

}
