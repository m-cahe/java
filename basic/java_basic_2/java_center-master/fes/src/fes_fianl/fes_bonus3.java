package fes_fianl;

public class fes_bonus3 {

	public static void main(String[] args) {

		System.out.println(isHarshad(11));

	}

	public static boolean isHarshad(int n) {
		int a = 10;
		int b = 0;
		int sum = 0;
		int C = n;
		boolean text = true;
		boolean text1 = false;
		while (a != 0) {
			a = n / 10;
			b = n - 10 * a;
			sum += b;
			n /= 10;
		}
		if (C % sum == 0) {
			return text;
		} else {
			return text1;
		}

	}
}
