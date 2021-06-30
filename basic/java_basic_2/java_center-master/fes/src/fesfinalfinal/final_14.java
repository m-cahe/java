package fesfinalfinal;

import java.util.Random;

public class final_14 {

	public static void main(String[] args) {

		Random rand=new Random();
		int[] arr=new int[6];
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=rand.nextInt(45)+1;
			System.out.printf("행운의 숫자 : %d\n", arr[i]);
			for (int j = 0; j < i; j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}

		
	}
}
