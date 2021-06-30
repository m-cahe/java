package fes_2;

public class fes_2_1 {

	public static void main(String[] args) {
		int[] arr=new int[77];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=77-i;
			System.out.printf("(%d*%d)", arr[i], i+1);
			if(i!=arr.length-1) {
				System.out.print("+");
			}
			sum+=(arr[i])*(i+1);
		}
		System.out.printf("\n°á°ú : %d", sum);
	}

}
