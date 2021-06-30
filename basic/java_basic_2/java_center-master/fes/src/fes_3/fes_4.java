package fes_3;

public class fes_4 {

	
	public static int fibo(int n) {
		int result=0;
		
		if(n==1) {
			result=1;
			return result;
		}
		if(n==2) {
			result=1;
			return result;
		}
		else {
			result=fibo(n-1)+fibo(n-2);
			return result;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		int input=8;
		for (int i=1;i<=input; i++) {
			System.out.print(fibo(i)+" ");
		}

		
		
		
	}

}
