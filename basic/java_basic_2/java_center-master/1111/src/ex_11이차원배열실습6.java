
public class ex_11�������迭�ǽ�6 {

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
		
		
		System.out.println("������ �밢�� ���� ȸ�� : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.printf("\t%d", arr[4-j][4-i]);

			}
			System.out.println();
		}

	}

}
