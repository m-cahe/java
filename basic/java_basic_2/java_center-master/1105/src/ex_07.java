import java.util.Scanner;

public class ex_07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("user1 이름 입력 : ");
		String user1 = scanner.next();
		System.out.print("user2 이름 입력 : ");
		String user2 = scanner.next();
		String answer = "";
		do {

			System.out.printf("%s님 가위, 바위, 보 중에 하나를 입력하세요. ", user1);
			String user1_pick = scanner.next();
			System.out.printf("%s님 가위, 바위, 보 중에 하나를 입력하세요. ", user2);
			String user2_pick = scanner.next();

			if (user1_pick.equals("가위")) {
				// 중첩가야할거같다
				if (user2_pick.equals("가위")) {
					System.out.println("비겼습니다!!");
				} else if (user2_pick.equals("바위")) {
					System.out.printf("%s님이 졌네요!!", user1);
				} else if (user2_pick.equals("보")) {
					System.out.printf("%s님이 이겼어요!!", user1);
				}
			}
			if (user1_pick.equals("바위")) {
				if (user2_pick.equals("바위")) {
					System.out.println("비겼습니다!!");
				} else if (user2_pick.equals("보")) {
					System.out.printf("%s님이 졌네요!!", user1);
				} else if (user2_pick.equals("가위")) {
					System.out.printf("%s님이 이겼어요!!", user1);
				}
			}
			if (user1_pick.equals("보")) {
				if (user2_pick.equals("보")) {
					System.out.println("비겼습니다!!");
				} else if (user2_pick.equals("바위")) {
					System.out.printf("%s님이 이겼어요!!", user1);
				} else if (user2_pick.equals("가위")) {
					System.out.printf("%s님이 졌네요!!", user1);
				}
			}

			System.out.print("\n계속하시겠습니까? (Y/N) ");
			answer = scanner.next();
			if (answer.equals("N")) {
				break;
			} else if (!answer.equals("N") && !answer.equals("Y")) {
				System.out.println("이해하지 못합니다.");
				break;
			}

		} while (answer.equals("Y"));
		System.out.println("가위바위보 프로그램을 종료합니다.");
	}

}
