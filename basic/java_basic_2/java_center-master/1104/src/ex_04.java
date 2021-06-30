import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int grade = scanner.nextInt();
		String result = "";
		if (grade >= 60) {
			result = "합격";
			System.out.printf("%s입니다", result);
		} else {
			result = "불합격";
			System.out.printf("%s입니다", result);
		}

		System.out.print("\n정수 입력 : ");
		int num = scanner.nextInt();
		String result1 = "";
		if (num % 2 == 0) {
			result1 = "짝수";
			System.out.printf("%d는 %s입니다", num, result1);
		} else {
			result1 = "홀수";
			System.out.printf("%d는 %s입니다", num, result1);
		}

	}

}
