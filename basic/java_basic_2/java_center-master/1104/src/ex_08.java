import java.util.Scanner;

public class ex_08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int month = scanner.nextInt();
		String season = "";
		switch (month / 3) {
		case 1:
			season = "��";
			System.out.printf("%d���� %s�Դϴ�!!", month, season);
			break;
		case 2:
			season = "����";
			System.out.printf("%d���� %s�Դϴ�!!", month, season);
			break;
		case 3:
			season = "����";
			System.out.printf("%d���� %s�Դϴ�!!", month, season);
			break;
		default:
			season = "�ܿ�";
			System.out.printf("%d���� %s�Դϴ�!!", month, season);
		}

	}

}
