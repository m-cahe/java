
public class ex_03 {

	public static void main(String[] args) {

		int[] arr = new int[100];
		int[] arr1 = new int[33];
		int i = 0;
		int j = 0;
		int k = 0;
		int sum = 0;
		// �迭 ���� �ڸ� ����
		for (i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			if (arr[i] % 3 == 0) {
				arr1[j] = arr[i];
			}
			for (k = 0; k < arr1.length; k++) {
				sum += arr1[k];
			}

		}
		System.out.printf("1~100���� 3�� ����� ���� %d", sum);

	}

}
