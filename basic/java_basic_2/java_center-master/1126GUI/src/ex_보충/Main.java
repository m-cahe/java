package ex_º¸Ãæ;

public class Main {

	public static void main(String[] args) {

		Junho jh = new Junho(28, 10, 30, 178, true);
		while (true) {
			jh.swimming();
			if (jh.getY() < -150) {
				break;
			}

		}
		jh.walk();
		System.out.println(jh.toString());
		System.out.println(jh.getX() +"    "+ jh.getY());
	}

}
