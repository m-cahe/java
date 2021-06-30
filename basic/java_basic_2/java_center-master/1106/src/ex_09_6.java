
public class ex_09_6 {
	public static void main(String[] args) {

		int[] dan = new int[8];
		int[] backnum = new int[9];
		for (int i = 0; i < backnum.length; i++) {
			backnum[i] = i + 1;
			for (int j = 0; j < dan.length; j++) {
				dan[j] = j + 2;
				int result = dan[j] * backnum[i];
				System.out.printf("%d*%d=%d ", dan[j], backnum[i], result);
				System.out.print("\t");
				// 줄 어떻게 맞추지
				if (j == 7) {
					System.out.print("\n");
				}
			}
		}

	}

}
