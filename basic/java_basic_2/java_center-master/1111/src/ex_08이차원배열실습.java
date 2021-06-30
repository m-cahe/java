
public class ex_08이차원배열실습 {
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

		
		int[][] temp = new int[5][5];


		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				temp[i][4-j] = arr[i][j];
			}
		}
		System.out.println("왼쪽 대각선 기준 회전 : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = temp[i][j];
				System.out.printf("\t%d", arr[i][j]);
				if (j == arr.length - 1) {
					System.out.println();
				}
			}
		}
		
		
		
		
	}

}