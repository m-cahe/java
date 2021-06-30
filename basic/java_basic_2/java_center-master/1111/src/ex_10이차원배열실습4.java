
public class ex_10이차원배열실습4 {

	public static void main(String[] args) {
		System.out.println("원본 : ");
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = arr.length * i + j + 1 + 20;
				System.out.printf("\t%d", arr[i][j]);
				if (j == arr.length - 1) {
					System.out.println();
				}
			}
		}
		
		
		System.out.println("90도 오른쪽 회전 : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.printf("\t%d", arr[4-j][i]);

			}
			System.out.println();
		}

	}

}
