package fes_fianl;

public class fes_24_1 {

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
		
		
		System.out.print("왼쪽 180도 회전 \n");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				
				System.out.print("\t" + arr[4-i][4-j] + " ");
				
			}
			System.out.println();
		}
	}

}
