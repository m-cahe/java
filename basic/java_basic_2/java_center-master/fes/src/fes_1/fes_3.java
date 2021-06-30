package fes_1;

public class fes_3 {

	public static void main(String[] args) {
		// Math.pow 제곱 계산
		int[] index = new int[100]; // 지수 배열
		int i = 0;// index 결정 변수
		// index 결정
		for (i = 0; i < index.length; i++) {
			index[i] = i;
		}
		// j자연수
		double k = 0;// 화면상 수
		double sum = 0;
		for (int j = 1; j <= 100; j++) {
			k = j * (Math.pow(-1, index[j - 1]));
			System.out.printf("%.0f ", k);
			sum += k;
		}
		System.out.printf("\n결과 : %.0f", sum);

	}

}
