import java.util.Scanner;

public class ex_12 {

	public static void main(String[] args) {

		// 1~1000 ������
		// ��� ã�� ��ã�� �� ��
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է� : \n");
		int k = scanner.nextInt();// �Է¹��� ����
		int sum = 0;
		for (int i = 1; i < k; i++) {
			if (k % i == 0) {
				sum += i;
				System.out.printf("%d ", i);
			}

		}
		if (k == sum) {
			System.out.printf("\n%d�� �������Դϴ�.", k);
		} else {
			System.out.printf("%d�� �������� �ƴմϴ�.", k);
		}

	}

}
