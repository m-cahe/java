
public class ex_11_3 {

	final static int N = 10;

	// 72
	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		for (i = -N; i <= N; i++) {
			for (j = -N; j <= N; j++) {
				if (i * i + j * j <= N * N) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}

}
