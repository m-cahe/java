import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int evenNum = 0;
		int oddNum = 0;
		while (i != -1) {
			System.out.print("���� �Է� : ");
			i = scanner.nextInt();
			if (i == -1) {
				break;
			}
			if (i % 2 == 0) {
				++evenNum;
				System.out.printf("¦�� ���� : %d", evenNum);
				System.out.printf("\nȦ�� ���� : %d\n", oddNum);
			} else {
				++oddNum;
				System.out.printf("¦�� ���� : %d", evenNum);
				System.out.printf("\nȦ�� ���� : %d\n", oddNum);
			}

		}
		System.out.print("����Ǿ����ϴ�.");

	}

}
