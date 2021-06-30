import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scanner.nextInt();
		String grade = "";
		if (score >= 90) {
			grade = "A";
			System.out.printf("%s학점입니다.", grade);
		} else if (score >= 80) {
			grade = "B";
			System.out.printf("%s학점입니다.", grade);
		} else if (score >= 70) {
			grade = "C";
			System.out.printf("%s학점입니다.", grade);
		} else {
			grade = "F";
			System.out.printf("%s학점입니다.", grade);
		}

	}

}
