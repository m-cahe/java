import java.util.Scanner;

public class ex_06_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String answer = "";
		System.out.print("=====start===== ");
		do {
			int[] array = new int[2];
			System.out.print("\nù ��° ������ �Է��ϼ��� : ");
			array[0] = scanner.nextInt();
			System.out.print("�� ��° ������ �Է��ϼ��� : ");
			array[1] = scanner.nextInt();
			System.out.print("[1]���ϱ� [2]���� >> ");
			int choice = scanner.nextInt();
			if (choice == 1) {
				System.out.println("���ϱ� ���� ����� " + (array[0] + array[1]));
			} else if (choice == 2) {
				System.out.println("���� ���� ����� " + (array[0] - array[1]));
			}
			// \n�� ���???
			System.out.print("����Ͻðڽ��ϱ�? (Y/N) ");
			answer = scanner.next();
			if (answer.equals("N")) {
				break;
			} else if (!answer.equals("N") && !answer.equals("Y")) {
				System.out.println("�������� ���մϴ�.");
				break;
			}

		} while (answer.equals("Y"));

		System.out.println("\n����Ǿ����ϴ�.");
		System.out.print("=====finish===== ");

	}

}
