package kr.smhrd;

public class MyUtil {
	public int n = 100;
	public int sum = 0;

	public int nSum() {
		// 1부터 n까지의 합
		for (int i = 1; i <= n; i++) {
			sum += i;

		}
		return sum;

	}

}
