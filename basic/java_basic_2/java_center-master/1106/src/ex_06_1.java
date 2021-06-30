import java.util.Scanner;

public class ex_06_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("시작 정수 입력 : ");
		int startnum = scanner.nextInt();
		System.out.print("끝나는 정수 입력 : ");
		int finishnum = scanner.nextInt();
		int i=finishnum-startnum+1;
		int j = 0;
		int[] arr = new int[i];
		for (j = 0; j < arr.length; j++) {
			arr[j] = j + startnum;
			System.out.printf("%d ", arr[j]);
		}

	}

}
