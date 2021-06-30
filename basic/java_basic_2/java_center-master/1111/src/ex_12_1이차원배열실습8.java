
public class ex_12_1이차원배열실습8 {

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

		System.out.println("지그재그 : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					System.out.printf("\t%d", arr[i][j]);
				} else {
					System.out.printf("\t%d", arr[i][4-j]);
				}
				
			}
			System.out.println();
		}
	}

}
