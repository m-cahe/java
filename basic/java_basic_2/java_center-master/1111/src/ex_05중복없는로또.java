import java.util.Arrays;

public class ex_05�ߺ����·ζ� {

	public static void main(String[] args) {

		int[] arr = new int[6];

		System.out.println("=====�ζ�Ÿ��=====");
		System.out.println("�̹��� ��¹�ȣ�¿�...!!�α��α��α�!!!");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		//�迭�� �ѹ��� ���
	}

}
