package kr.smhrd.model;

public class MyUtil {
	public int hap(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		return sum;
	}
}
