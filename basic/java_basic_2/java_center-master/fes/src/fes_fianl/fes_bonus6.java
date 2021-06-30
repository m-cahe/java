package fes_fianl;

public class fes_bonus6 {

	public static void main(String[] args) {
		int strat = 0;
		int end = 4;
		char[][] arr = new char[5][5];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = strat; j <= end; j++) {
				arr[i][j] = (char) ('A' + cnt);
				cnt++;

			}

			if (i < 2) {
				strat++;
				end--;
			} else {
				strat--;
				end++;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t ");
			}
			System.out.println();
		}

	}

}
