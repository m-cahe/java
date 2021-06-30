package fes_2;

public class fes_2 {

	public static void main(String[] args) {
	
		
		int num=77;
		int sum=0;
		for (int i=1; i<=77; i++) {
			System.out.printf("(%d*%d)", num-i+1,i);
			sum+=(num-i+1)*i;
			
			if(i!=77) {
				System.out.print("+");
			}
		}
		System.out.printf("\n°á°ú : %d", sum);

	}

}
