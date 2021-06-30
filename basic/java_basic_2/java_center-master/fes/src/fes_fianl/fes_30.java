package fes_fianl;

public class fes_30 {

	public static void main(String[] args) {

		int[][] arr = new int[7][7];
		int start = 3;
		int end = 3;
		int cnt1 = 1;
		System.out.println("다이아몬드 원본: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = start; j <= end; j++) {
				arr[i][j] = cnt1;
				cnt1++;
			}

			if (i < 3) {
				start--;
				end++;
			} else {
				start++;
				end--;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		
		System.out.println("다이아몬드 왼쪽대각선 회전 : ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		
	}

}
