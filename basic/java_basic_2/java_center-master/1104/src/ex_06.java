import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// intput�ȳ��ϼ��� �ݰ����� �����ϼ��� ����
		// output �� �ȳ��ϼ��� �� �ݰ����� �� �����ϼ��� �߸� �Է��Ͽ����ϴ�.
		System.out.print("user : ");
		String sentence = scanner.next();
		switch (sentence) {
		case "�ȳ��ϼ���":
			System.out.println("pc : �� �ȳ��ϼ���.");
			break;
		case "�ݰ�����":
			System.out.println("pc : �� �ݰ�����.");
			break;
		case "�����ϼ���":
			System.out.println("pc : �� �����ϼ���.");
			break;
		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}

	}

}
