import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {

		// 상자 하나 농구공 5개 만약 농구공 23개라면 상자의 개수는?

		Scanner scanner = new Scanner(System.in);
		System.out.print("농구공의 갯수를 입력하세요 : ");
		int number = scanner.nextInt();
		int result = (number % 5 < 5 && number % 5 != 0) ? number / 5 + 1 : number / 5;
		// 나머지가 있냐 없냐로 따지면 되니까 밑의 것이 맞다
		int result1 = (number % 5 == 0) ? number / 5 : number / 5 + 1;
		System.out.println("필요한 상자의 수 : " + result);
		System.out.println("필요한 상자의 수 : " + result1);

	}

}
