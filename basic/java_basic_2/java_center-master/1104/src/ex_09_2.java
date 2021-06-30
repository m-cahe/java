import java.util.Scanner;

public class ex_09_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요 >> ");
		int amount = scanner.nextInt();
		System.out.println("메뉴를 고르세요");
		System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원)>> ");
		int num = scanner.nextInt();
// 메인 영역 안에서 사용할수있는 '전역변수' 
		int smallChange = 0;
		/* smallChange변수는 각 메뉴에 대한 최종 잔돈을 저장하고있다.
		 * 각 메뉴별로 작업에 참여하는 잔돈 계산 기능은 중복작업이므로
		 * switch를 빠져나와 마지막에 한번만 작업하기!! 
		 * */
		switch (num) {
		case 1:
			if (amount >= 800) {
				smallChange = amount - 800;
				System.out.printf("잔돈 : %d", smallChange);
			}
			else {
				smallChange=amount;
				System.out.printf("잔돈이 부족합니다.");
				System.out.printf("\n잔돈 : %d", smallChange);
			}
			break;
		case 2:
			if (amount >= 500) {
				smallChange = amount - 500;
				System.out.printf("잔돈 : %d", smallChange);
			}
			else {
				smallChange=amount;
				System.out.printf("잔돈이 부족합니다.");
				System.out.printf("\n잔돈 : %d", smallChange);
			}
			break;
		case 3:
			if (amount >= 1500) {
				smallChange = amount - 1500;
				System.out.printf("잔돈 : %d", smallChange);
			}
			else {
				smallChange=amount;
				System.out.printf("잔돈이 부족합니다.");
				System.out.printf("\n잔돈 : %d", smallChange);
			}
			break;

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
