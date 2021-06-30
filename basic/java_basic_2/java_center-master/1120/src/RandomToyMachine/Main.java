package RandomToyMachine;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

	}

	class Toy {
		String name;

		void play() {
			System.out.println("³î´Ù");
		}
	}

	class RandomToyMachine {
		ArrayList<Toy> toyList = new ArrayList();// Àå³­°¨ ¸ñ·Ï
		Random r = new Random();// ·£´ý°´Ã¼

		void addToy(Toy toy) {
			toyList.add(toy);
		}

//		Toy getToy() {
//			
//			return Toy;
//		} ÀÌ°Å ¹®Á¦°¡ ¸Õµ¥

	}

	class Ball extends Toy {
		void play() {
			System.out.println("ÅÊÅÊÆÃÆÃÆÃ±¸¸£¸£");
		}
	}

	class Train extends Toy {
		void play() {
			System.out.println("Ä¢Ä¢ÆøÆø");
		}
	}

	class Gun extends Toy {
		void play() {
			System.out.println("Å©¸£¸£Ä¬Ä¬¹ð¹ð");
		}
	}

}
