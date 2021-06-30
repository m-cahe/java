
public class ex_06이차원배열 {

	public static void main(String[] args) {

		int[] array = { 20, 19, 21 };
		int[] array2 = { 30, 31, 32 };
		int[] array3 = { 40, 41, 42 };

		int[][] age = new int[3][3];

		age[0] = array;
		age[1] = array2;
		age[2] = array3;
		for (int i = 0; i < age.length; i++) {
			for (int j = 0; j < age[i].length; j++) {
				System.out.print(age[i][j]+" ");
				if(j==age[i].length-1) {
					System.out.println();
				}
			}

		}

	}
}
