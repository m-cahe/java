
public class ex_12�������迭�ǽ�8 {

	public static void main(String[] args) {
		System.out.println("���� : ");
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
		int N = 5;
		System.out.println("������� : ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i % 2 == 0) {
					arr[i][j] = N * i + j + 1 + 20;
					System.out.printf("\t%d ", arr[i][j]);
				} else {
					arr[i][j] = N * (i + 1) - j + 20;
					System.out.printf("\t%d ", arr[i][j]);
				}

			}
			System.out.println();
		}
	}
}
