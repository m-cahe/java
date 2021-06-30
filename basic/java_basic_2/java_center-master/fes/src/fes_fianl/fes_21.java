package fes_fianl;

public class fes_21 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int min = 150;
		for (int i = 0; i < point.length; i++) {
			for (int j = i + 1; j < point.length; j++) {
				if (min > absoulte(point[i], point[j])) {
					min = absoulte(point[i], point[j]);

				}
			}

		}

		System.out.printf("최소거리 : %d ", min);
		for (int i = 0; i < point.length; i++) {
			for (int j = i + 1; j < point.length; j++) {
				if (min == absoulte(point[i], point[j])) {
					System.out.printf("\nresult = [%d, %d]", i, j);

				}
			}

		}

	}

	public static int absoulte(int m, int n) {
		int result = 0;
		if (m > n) {
			result = m - n;
		} else {
			result = -(m - n);
		}

		return result;

	}

}
