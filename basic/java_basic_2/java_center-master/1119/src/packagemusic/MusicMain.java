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
		list.add(new Music("��", "��", "C:/Users/smhrd/Desktop/musicplayer/��.mp3"));
		list.add(new Music("��¦ ������", "�����̰�", "C:/Users/smhrd/Desktop/musicplayer/��¦ ������.mp3"));
		list.add(new Music("Maria", "ȭ��", "C:/Users/smhrd/Desktop/musicplayer/Maria.mp3"));
		list.add(new Music("MAGO", "����ģ��", "C:/Users/smhrd/Desktop/musicplayer/MAGO.mp3"));
		list.add(new Music("How you like that", "����ũ", "C:/Users/smhrd/Desktop/musicplayer/How you like that.mp3"));

		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (true) {
		
			System.out.print("1.��� 2.���� 3.������ 4.������ 5.���� >> ");
			int menu = sc.nextInt();
			if (menu == 1) {

				musicStart(mp3, list, i);

			}
//����ϴ� ��� ������ list ù��° �뷡 ��� .play
			// �� ����Ǵ� �뷡 ���� ���
			else if (menu == 2) {
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}
			}

			else if (menu == 3) {
				// �� �����ϰ� ������ index ����
				// �� ������ ��� �������� ó�������� ���ư���
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
				System.out.println("����Ǿ����ϴ�.");
				break;
			}

			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

		}
	}

	public static void musicStart(MP3Player mp3, ArrayList<Music> list, int i) {
		mp3.play(list.get(i).getPath());
		System.out.println(list.get(i).getSinger() + " - " + list.get(i).getTitle());
	}
}
