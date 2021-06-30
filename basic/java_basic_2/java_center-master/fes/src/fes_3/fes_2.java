package fes_3;

import java.util.Scanner;

public class fes_2 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 N 입력 : ");
		int N=scanner.nextInt();
		int[][] nArr=new int[N][N];
		int i=0;
		int j=0;
		for(i=0; i<nArr.length; i++) {
			for(j=0; j<nArr.length; j++) {
				nArr[i][j]=i+1+5*j;
				System.out.printf("%d ", nArr[i][j]);
				if(j==nArr.length-1) {
					System.out.print("\n");
				}
			}
		}

	}

}
