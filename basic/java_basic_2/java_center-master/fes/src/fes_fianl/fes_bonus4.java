package fes_fianl;

public class fes_bonus4 {

	public static void main(String[] args) {

		System.out.println(jumpCase(4));

	}

	public static int fibo(int n) {

		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}

	}

	public static int jumpCase(int n) {
		int result = 0;
		int sum = 1;
		if (n == 1) {
			result = 1;
		}
		if (n >= 2) {
			for (int i = 1; i < n; i++) {
				sum += fibo(i);
			}
		}

		return sum;

	}

}