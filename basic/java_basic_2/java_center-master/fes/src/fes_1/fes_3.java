package fes_1;

public class fes_3 {

	public static void main(String[] args) {
		// Math.pow ���� ���
		int[] index = new int[100]; // ���� �迭
		int i = 0;// index ���� ����
		// index ����
		for (i = 0; i < index.length; i++) {
			index[i] = i;
		}
		// j�ڿ���
		double k = 0;// ȭ��� ��
		double sum = 0;
		for (int j = 1; j <= 100; j++) {
			k = j * (Math.pow(-1, index[j - 1]));
			System.out.printf("%.0f ", k);
			sum += k;
		}
		System.out.printf("\n��� : %.0f", sum);

	}

}
