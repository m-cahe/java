package fes_2;

public class fes_4 {

	public static void main(String[] args) {
		
		int[] arr= new int[8];
		int max=-1;
		int min=101;
		System.out.print("배열에 있는 모든 값 : ");
		for (int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*99+1);
			System.out.printf("%d ", arr[i]);
		}
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.printf("\n가장 큰 값 : %d", max);
		System.out.printf("\n가장 작은 값 : %d", min);
		

	}

}
