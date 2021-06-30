
public class ex_2 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int first = 0;
		int second = 1;
		for (int j = 0; j < point.length; j++) {
			for (int i = j+1; i < point.length; i++) {
				int num1 = point[0] - point[i];
				int num2 = point[first] - point[second];
				if (num1 * num1 < num2 * num2) {
					first = j;
					second = i;
				}
			}

		}
		
		System.out.println("result"+first+","+second);
	}
}