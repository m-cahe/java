package fes_2;

public class fes_6 {

	public static void main(String[] args) {
		
		int[] lotto=new int [6];
		for (int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45+1);
			System.out.printf("행운의 숫자 : %d\n", lotto[i]);
			for(int j=1; i+j<lotto.length; j++) {
				if(lotto[i]==lotto[i+j]) {
					i--;
					continue;
				}
			}
		}

	}

}
