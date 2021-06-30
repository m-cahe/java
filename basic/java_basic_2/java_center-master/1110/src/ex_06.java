
public class ex_06 {

	public static void main(String[] args) {
		//1. 배열 생성 초기화 
		int[] arr= {3,4,4,2,1};
		//2. 
		for (int i=0 ; i<arr.length; i++) {
			System.out.printf("%d : ", arr[i]);
			for (int j=0; j<arr[i]; j++) {
				System.out.print("*");
				if(j==arr[i]-1) {
					System.out.println();
				}
			}
		}
		
		
		
		
		

	}

}
