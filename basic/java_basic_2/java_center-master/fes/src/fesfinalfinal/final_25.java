package fesfinalfinal;

import java.util.Scanner;

public class final_25 {

	public static void main(String[] args) {

		System.out.print(isHarshad(18));

	}

	public static boolean isHarshad(int n) {
		
		int a=10;
		int b=0;
		int sum=0;
		int C=n;
		while(a!=0){
			a=n/10;
			b=n-10*a;
			sum+=b;
			n/=10;
			
		}		
		if(C%sum==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
