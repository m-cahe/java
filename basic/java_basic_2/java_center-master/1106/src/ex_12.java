import java.util.Scanner;

public class ex_12 {

	public static void main(String[] args) {

		// 1~1000 완전수
		// 약수 찾기 합찾기 합 비교
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : \n");
		int k = scanner.nextInt();// 입력받은 정수
		int sum = 0;
		for (int i = 1; i < k; i++) {
			if (k % i == 0) {
				sum += i;
				System.out.printf("%d ", i);
			}

		}
		if (k == sum) {
			System.out.printf("\n%d는 완전수입니다.", k);
		} else {
			System.out.printf("%d는 완전수가 아닙니다.", k);
		}

	}

}
