package fes_1;

public class fes_3_1 {

	public static void main(String[] args) {

		int i = 0; // �ڿ���
		double j = 0;// ����
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
		System.out.printf("\n+��� : %d", plussum);
		System.out.printf("\n-��� : %.0f", minussum);
		System.out.printf("\n��� : %.0f", sum);
	}

}
