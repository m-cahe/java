package RandomToyMachine;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

	}

	class Toy {
		String name;

		void play() {
			System.out.println("���");
		}
	}

	class RandomToyMachine {
		ArrayList<Toy> toyList = new ArrayList();// �峭�� ���
		Random r = new Random();// ������ü

		void addToy(Toy toy) {
			toyList.add(toy);
		}

//		Toy getToy() {
//			
//			return Toy;
//		} �̰� ������ �յ�

	}

	class Ball extends Toy {
		void play() {
			System.out.println("���������ñ�����");
		}
	}

	class Train extends Toy {
		void play() {
			System.out.println("ĢĢ����");
		}
	}

	class Gun extends Toy {
		void play() {
			System.out.println("ũ����ĬĬ���");
		}
	}

}
