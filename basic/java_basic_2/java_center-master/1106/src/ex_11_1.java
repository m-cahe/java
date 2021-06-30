
public class ex_11_1 {

	final static int N = 5;

	public static void main(String[] args) {

		int line = 0;
		int star = 0;
		for (line = 1; line <= N; line++) {
			for (star = N; star >= line; star--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
