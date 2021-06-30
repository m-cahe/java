
public class ex_10피보나치 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d ", getFibo(i));
		}

	}

	public static int getFibo(int n) {
		int result = 0;
		if (n == 1) {
			result = 1;
		} else if (n == 2) {
			result = 1;
		} else {
			result = getFibo(n - 1) + getFibo(n - 2);
		}
		return result;
	}

}
