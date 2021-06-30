package fes_fianl;

import java.util.Random;

public class fes_14 {

	public static void main(String[] args) {
		int[] lotto=new int [6];
		Random rand =new Random();
		for (int i=0; i<lotto.length; i++) {
			lotto[i]=rand.nextInt(45)+1;
			System.out.printf("행운의 숫자 : %d\n", lotto[i]);
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}

	}

}
