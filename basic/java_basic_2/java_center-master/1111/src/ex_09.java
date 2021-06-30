
public class ex_09 {
	public static void main(String[] args) {

		// 5행5열 정수형 이차원 배열 만들기

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

		System.out.println("변경 전 : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.printf("\t%d", arr[i][4-j]);
				
			}
			System.out.println();
		}
	}

}