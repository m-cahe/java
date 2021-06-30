import java.util.Scanner;

public class ex_08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = scanner.nextInt();
		String season = "";
		switch (month / 3) {
		case 1:
			season = "봄";
			System.out.printf("%d월은 %s입니다!!", month, season);
			break;
		case 2:
			season = "여름";
			System.out.printf("%d월은 %s입니다!!", month, season);
			break;
		case 3:
			season = "가울";
			System.out.printf("%d월은 %s입니다!!", month, season);
			break;
		default:
			season = "겨울";
			System.out.printf("%d월은 %s입니다!!", month, season);
		}

	}

}
