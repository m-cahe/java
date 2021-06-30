package fes_3;

import java.util.Scanner;

public class fes_11 {

	public static void main(String[] args) {
		int n = 0;
		int max = -1;
		int temp = 0;
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d번째 수 입력 : ", i + 1);
			arr[i] = scanner.nextInt();
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) { 
					temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;}
				
			}
		
		
		
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}

	}

}
