package fes_3;

public class fes_7 {

	public static int CollatzNumber(int n) {
		int k=0;// È½¼ö
		while (n!=1) {
			if(n%2==0) {
				n=n/2;
				k++;
			}
			else {
				n=3*n+1;
				k++;
			}
			if(k>500) {
				k=-1;
				break;
			}
		}
		return k;
	}
	
	
	
	
	public static void main(String[] args) {
		int number=CollatzNumber(6);
		System.out.println(number);

	}

}
