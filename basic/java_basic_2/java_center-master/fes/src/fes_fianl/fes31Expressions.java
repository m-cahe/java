package fes_fianl;

public class fes31Expressions {

	public static int expressions(int n) {
		int count = 0;
		int sum = 0;
		for (int i = 1; i < n + 1; i += 2) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
//홀수인 약수 개수
	}

}
