import java.util.Scanner;

public class ex_09 {

	public static void main(String[] args) {
//자판기 잔돈까지
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요 >> ");
		int amount = scanner.nextInt();
		System.out.println("메뉴를 고르세요");
		System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원)>> ");
		int num = scanner.nextInt();
		int smallChange = 0;
		if (num == 1 && amount >= 800) {
			smallChange = amount - 800;
			System.out.printf("잔돈 : %d", smallChange);
		} else if (num == 2 && amount >= 500) {
			smallChange = amount - 500;
			System.out.printf("잔돈 : %d", smallChange);
		} else if (num == 3 && amount >= 1500) {
			smallChange = amount - 1500;
			System.out.printf("잔돈 : %d", smallChange);
		} else {
			System.out.print("돈이 부족하거나 잘못된 번호네요 ㅠㅠ");
			System.out.printf("\n잔돈 : %d", amount);
			smallChange = amount;
		}

		int thousandDigits = smallChange / 1000;
		smallChange -= thousandDigits * 1000;
		int fivehundredDigits = smallChange / 500;
		smallChange -= fivehundredDigits * 500;
		int hundredDigits = smallChange / 100;
		smallChange -= hundredDigits * 100;
		System.out.printf("\n천원 : %d개, 오백원 : %d개, 백원 : %d개", thousandDigits, fivehundredDigits, hundredDigits);

	}

}
