package fesfinalfinal;

import java.util.Scanner;

public class final_03 {

	public static void main(String[] args) {
		int[] arr= new int [100];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
		}
		int plussum=0;
		int minussum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				plussum+=arr[i]*-1;
				
			}
			else {
				minussum+=arr[i];
			}
		}
		int sum=plussum+minussum;
		System.out.printf("°á°ú : %d", sum);
	}

}
