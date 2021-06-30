package fes_1;

public class fes_3_1 {

	public static void main(String[] args) {

		int i = 0; // 자연수
		double j = 0;// 정수
		int plussum = 0;
		double minussum = 0;
		double sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d ", i);
				plussum += i;
			} else {
				j = -1 * i;
				System.out.printf("%.0f ", j);
				minussum += j;
			}

		}
		sum = plussum + minussum;
		System.out.printf("\n+결과 : %d", plussum);
		System.out.printf("\n-결과 : %.0f", minussum);
		System.out.printf("\n결과 : %.0f", sum);
	}

}
