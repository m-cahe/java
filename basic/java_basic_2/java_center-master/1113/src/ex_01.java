
public class ex_01 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int min = 150;
		for (int i = 0; i < point.length; i++) {
			for (int j = i+1; j < point.length; j++) {
				if (min > absoulte(point[i], point[j])) {
					min = absoulte(point[i], point[j]);
				}
			}

		
		
		}
		for (int i = 0; i < point.length; i++) {
			for (int j = i+1; j < point.length; j++) {
				if (min == absoulte(point[i], point[j])) {
					System.out.printf("result = [%d, %d]", i, j);

				}
				
			}
		}

	}

	public static int absoulte(int i, int j) {
		int result = i >= j ? i - j : -(i - j);
		return result;
	}

}
