package fes_fianl;

public class fes_24 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		System.out.print("원본 \n");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = 5 * i + j + 1;
				System.out.print("\t" + arr[i][j] + " ");
				if (j == arr.length - 1) {
					System.out.println();
				}
			}
		}
		int[][] temp = new int[5][5];
//temp arr i j 바꾸기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				temp[4 - i][4-j] = arr[i][j];

			}
		}

		System.out.print("180도 회전 \n");
		
		
		
		for(int i=0; i<arr.length; i++) {
	         for(int j=0; j<arr.length; j++) {
	            arr[i][j]=temp[i][j];
	         System.out.print("\t"+arr[i][j] +" ");
	         if(j==arr.length-1) {
	            System.out.println();
	         }
	      }
	   }
	   
	}

}
