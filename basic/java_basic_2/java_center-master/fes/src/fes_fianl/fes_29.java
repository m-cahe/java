package fes_fianl;

public class fes_29 {

	public static void main(String[] args) {

		int[][] arr = new int[8][8];
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (int) (Math.random() * 99 + 1);
				System.out.printf("%d ", arr[i][j]);
				if (j == arr.length - 1) {
					System.out.println();
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		System.out.printf("ÃÖ´ñ°ª : %d", max);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (max == arr[i][j]) {
					System.out.printf("\nÇà : %d   ¿­ : %d ", i + 1, j + 1);
					break;
				}
			}
		}
	}

}
