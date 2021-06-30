import java.util.Scanner;

public class ex_07_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("user1 이름 입력 : ");
		String user1 = scanner.next();
		System.out.print("user2 이름 입력 : ");
		String user2 = scanner.next();
		String answer = "";
		int i=0;
		int j=0;
		String [] arr= {"가위", "바위","보"};
		do {
			i=(int)(Math.random()*3);
			j=(int)(Math.random()*3);
			System.out.printf("%s님 %s 네요!!\n", user1, arr[i]);
			System.out.printf("%s님 %s 네요!!\n", user2, arr[j]);
			if (arr[i].equals(arr[0])) {
				// 중첩가야할거같다
				if (arr[j].equals(arr[0])) {
					System.out.println("비겼습니다!!");
				} else if (arr[j].equals(arr[1])) {
					System.out.printf("%s님이 졌네요!!", user1);
				} else if (arr[j].equals(arr[2])) {
					System.out.printf("%s님이 이겼어요!!", user1);
				}
			}
			if (arr[i].equals(arr[1])) {
				if (arr[j].equals(arr[1])) {
					System.out.println("비겼습니다!!");
				} else if (arr[j].equals(arr[2])) {
					System.out.printf("%s님이 졌네요!!", user1);
				} else if (arr[j].equals(arr[0])) {
					System.out.printf("%s님이 이겼어요!!", user1);
				}
			}
			if (arr[i].equals(arr[2])) {
				if (arr[j].equals(arr[2])) {
					System.out.println("비겼습니다!!");
				} else if (arr[j].equals(arr[1])) {
					System.out.printf("%s님이 이겼어요!!", user1);
				} else if (arr[j].equals(arr[0])) {
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
