
public class ex_10_1 {

	public static void main(String[] args) {
		
		int i=0;//i의 약수
		int j=0;//약수들
		int k=0;
		for (i=2; i<=30;i++) {
			System.out.printf("%d의 약수 : ", i);
			for (j=1; j<=i;j++) {
				if (i%j==0) {
					k=j;
					System.out.printf("%d ", k);
				if(k==i) {
					System.out.println();
					
				}	
				}
			}
			
		}
		
		

	}

}
