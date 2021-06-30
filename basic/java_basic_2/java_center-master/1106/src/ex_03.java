
public class ex_03 {

	public static void main(String[] args) {

		int[] arr = new int[100];
		int[] arr1 = new int[33];
		int i = 0;
		int j = 0;
		int k = 0;
		int sum = 0;
		// 배열 숫자 자리 선정
		for (i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			if (arr[i] % 3 == 0) {
				arr1[j] = arr[i];
			}
			for (k = 0; k < arr1.length; k++) {
				sum += arr1[k];
			}

		}
		System.out.printf("1~100까지 3의 배수의 합은 %d", sum);

	}

}
