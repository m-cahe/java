
public class ex_03�������� {

	public static void main(String[] args) {

		int[] arr = { 44, 98, 2, 5, 17 };
		// �������� ���� ����->���� ū���� ���� ������;4���ε����� �����Ѵ�.
		// ���� ū�� ���� �ε��� ��ȣ ã��
		int maxIndex = 0;
		int temp = 0;
		for (int j =4; j > 0; j--) {

			for (int i = 0; i <=j; i++) {
				if (arr[i] > arr[maxIndex]) {
					maxIndex = i;
				}

			}
			temp = arr[j];
			arr[j] = arr[maxIndex];
			arr[maxIndex] = temp;
			
		}
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
