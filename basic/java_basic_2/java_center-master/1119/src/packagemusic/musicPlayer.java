package packagemusic;

import java.util.ArrayList;
import java.util.Scanner;

public class musicPlayer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList();

		list.add("마리아");
		list.add("HowYouLikeThat");
		list.add("깡");
		list.add("살짝설렜어");

		while (true) {
			System.out.print("[1]노래조회 [2]노래추가 [3]노래삭제 [4]종료 >>");
			int menu = scanner.nextInt();
			if (menu == 1) {
				playList(list);
			} else if (menu == 2) {
				playList(list);

				// 노래 추가
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				int menu1 = scanner.nextInt();
				if (menu1 == 1) {
					System.out.print("추가할 노래 입력 >> ");
					list.add(scanner.next());
					System.out.println("추가가 완료되었습니다.");
				} else if (menu1 == 2) {
					System.out.print("추가할 노래 입력 >> ");
					String music = scanner.next();
					System.out.print("추가할 위치 입력 >> ");
					list.add(scanner.nextInt() - 1, music);
					System.out.println("추가가 완료되었습니다.");
				}

			} else if (menu == 3) {
//노래 삭제
				playList(list);
				System.out.print("[1]선택 삭제 [2] 전채 삭제");
				int menu1 = scanner.nextInt();
				if (menu1 == 1) {
					System.out.print("삭제할 노래 선택");
					list.remove(scanner.nextInt() - 1);
					System.out.println("노래가 삭제되었습니다.");
				} else if (menu1 == 2) {
					list.clear();
					System.out.println("전체 노래가 삭제되었습니다.");
				}

			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}

		}
	}

	public static void playList(ArrayList<String> list) {
		// 노래 조회
		System.out.println("────────현재 재생 목록────────");

		if (list.size() == 0) {
			System.out.println("재생 목록이 없습니다.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d. %s\n", i + 1, list.get(i));
			}
		}
		System.out.println("──────────────────────────");
	}
}
