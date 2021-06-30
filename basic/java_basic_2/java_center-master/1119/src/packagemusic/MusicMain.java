package packagemusic;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {
	public static void main(String[] args) {
		MP3Player mp3 = new MP3Player();
//		mp3.play("C:/Users/smhrd/Desktop/musicplayer/MAGO.mp3");
		// MAGO

		ArrayList<Music> list = new ArrayList();
		list.add(new Music("깡", "비", "C:/Users/smhrd/Desktop/musicplayer/깡.mp3"));
		list.add(new Music("살짝 설렜어", "오마이걸", "C:/Users/smhrd/Desktop/musicplayer/살짝 설렜어.mp3"));
		list.add(new Music("Maria", "화사", "C:/Users/smhrd/Desktop/musicplayer/Maria.mp3"));
		list.add(new Music("MAGO", "여자친구", "C:/Users/smhrd/Desktop/musicplayer/MAGO.mp3"));
		list.add(new Music("How you like that", "블랙핑크", "C:/Users/smhrd/Desktop/musicplayer/How you like that.mp3"));

		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (true) {
		
			System.out.print("1.재생 2.정지 3.다음곡 4.이전곡 5.종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {

				musicStart(mp3, list, i);

			}
//재생하는 기능 무조건 list 첫번째 노래 재생 .play
			// 그 재생되는 노래 정보 출력
			else if (menu == 2) {
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}
			}

			else if (menu == 3) {
				// 곡 정지하고 다음곡 index 증가
				// 단 마지막 곡에서 다음곡은 처음곡으로 돌아가기
				mp3.stop();
				i++;
				if (i == list.size()) {
					i = 0;
				}
				musicStart(mp3, list, i);

			}

			else if (menu == 4) {
				mp3.stop();
				i--;
				if (i < 0) {
					i = list.size() - 1;
				}
				musicStart(mp3, list, i);

			}

			else if (menu == 5) {
				System.out.println("종료되었습니다.");
				break;
			}

			else {
				System.out.println("잘못 입력하셨습니다.");
			}

		}
	}

	public static void musicStart(MP3Player mp3, ArrayList<Music> list, int i) {
		mp3.play(list.get(i).getPath());
		System.out.println(list.get(i).getSinger() + " - " + list.get(i).getTitle());
	}
}
