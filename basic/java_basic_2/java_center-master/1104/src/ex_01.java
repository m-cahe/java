import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {

		// 두개 정수 입력 큰수에서 작은수 뺀거 출력

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번쨰 정수 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("두 번쨰 정수 입력 : ");
		int num2 = scanner.nextInt();
		int result = (num1 >= num2) ? num1 - num2 : num2 - num1;
		System.out.printf("\t두 수의 차 : %d", result);
		System.out.print("\n\t두 수의 합 : "+ (num1+num2));
	}

}
