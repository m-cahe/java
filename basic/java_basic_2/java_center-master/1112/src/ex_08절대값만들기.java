import java.util.Scanner;

public class ex_08절대값만들기 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 정수 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = scanner.nextInt();
		int result = getAbsoluteValue(num1, num2);
		System.out.println("결과 확인 : " + result);
	}

	public static int getAbsoluteValue(int n, int m) {
		int result = 0;
		result = (n > m) ? n - m : m - n;
		if (n == m) {
			result = 0;
		}
		return result;
	}

}
