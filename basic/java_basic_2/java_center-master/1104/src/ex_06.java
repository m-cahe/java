import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// intput안녕하세요 반가워요 수고하세요 뭐야
		// output 예 안녕하세요 네 반가워요 네 수고하세요 잘못 입력하였습니다.
		System.out.print("user : ");
		String sentence = scanner.next();
		switch (sentence) {
		case "안녕하세요":
			System.out.println("pc : 네 안녕하세요.");
			break;
		case "반가워요":
			System.out.println("pc : 네 반가워요.");
			break;
		case "수고하세요":
			System.out.println("pc : 네 수고하세요.");
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
		}

	}

}
