import java.util.Scanner;

public class ex_07 {

	public static void main(String[] args) {

		// 1. 4ĭ¥�� ������ �迭
		// 2. Scanner ���� 4�� �Է� �޾� �迭 ����
		// 3. ������ ���� Ȧ���϶��� ���

		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d��° ���� �Է� : ", i + 1);
			arr[i] = scanner.nextInt();
		}
		System.out.print("�迭�� ��� �ִ� Ȧ���� ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.printf("%d ", arr[i]);
			}
		}

	}

}
