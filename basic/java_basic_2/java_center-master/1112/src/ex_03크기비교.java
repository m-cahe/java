import java.util.Scanner;

public class ex_03ũ��� {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 24;
		int result = LargerNumbers(num1, num2);

		System.out.println("ū �� Ȯ�� : " + result);
		System.out.println("ū �� Ȯ�� : " + LargerNumbers(2, 7));
		System.out.println("ū �� Ȯ�� : " + LargerNumbers(9, 5));
		System.out.println("ū �� Ȯ�� : " + LargerNumbers(8, 15));
		System.out.println("ū �� Ȯ�� : " + LargerNumbers(6, 6));

	}

	public static int LargerNumbers(int n, int m) {
		int result = 0;
		if (n > m) {
			result = n;

		} else if (n < m) {
			result = m;

		} else {
			result = 0;
		}
		return result;

	}

}
