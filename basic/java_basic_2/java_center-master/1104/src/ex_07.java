import java.util.Scanner;

public class ex_07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int totalscore = scanner.nextInt();
		String grade = "";
		switch (totalscore / 10) {
		case 10:

		case 9:
			grade = "A";
			System.out.printf("%s�����Դϴ�!!", grade);
			break;
		case 8:
			grade = "B";
			System.out.printf("%s�����Դϴ�!!", grade);
			
			break;
		case 7:
			grade = "C";
			System.out.printf("%s�����Դϴ�!!", grade);
			break;
		default:
			grade = "D";
			System.out.printf("%s�����Դϴ�!!", grade);
		}

	}

}
