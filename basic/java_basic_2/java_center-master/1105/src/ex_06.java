import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String answer = "";
		System.out.print("=====start===== ");
		do {
			
			System.out.print("\nù ��° ������ �Է��ϼ��� : ");
			int num1 = scanner.nextInt();
			System.out.print("�� ��° ������ �Է��ϼ��� : ");
			int num2 = scanner.nextInt();
			System.out.print("[1]���ϱ� [2]���� >> ");
			int choice = scanner.nextInt();
			if (choice == 1) {
				System.out.println("���ϱ� ���� ����� " + (num1 + num2));
			} else if (choice == 2) {
				System.out.println("���� ���� ����� " + (num1 - num2));
			}
			// \n�� ���???
			System.out.print("����Ͻðڽ��ϱ�? (Y/N) ");
			answer = scanner.next();
			if (answer.equals("N")) {
				break;
			}
			else if (!answer.equals("N")&&!answer.equals("Y")){
				System.out.println("�������� ���մϴ�.");
				break;
			}
			

		} while (answer.equals("Y"));

		System.out.println("\n����Ǿ����ϴ�.");
		System.out.print("=====finish===== ");

	}

}
