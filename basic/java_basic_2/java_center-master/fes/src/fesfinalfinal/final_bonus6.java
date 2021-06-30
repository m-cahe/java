package fesfinalfinal;

import java.util.Scanner;

public class final_bonus6 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.print("배열의 크기 : ");
int N=scanner.nextInt();
		char[][] arr = new char[N][N];
		int start = 0;
		int end = arr.length;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = start; j < end; j++) {
				arr[i][j] = (char) ('A' + cnt);
				cnt++;
			}
			if (i < arr.length/2) {
				start++;
				end--;
			} else {
				start--;
				end++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
