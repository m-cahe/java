
public class ex_09_other {

	public static void main(String[] args) {
		// 구구단 2단
		int[] twodan = new int[9];
		for (int i = 0; i < twodan.length; i++) {
			twodan[i] = i + 1;
			int result = 2 * twodan[i];
			System.out.printf("2*%d=%d\n", i + 1, result);

		}

	}

}
