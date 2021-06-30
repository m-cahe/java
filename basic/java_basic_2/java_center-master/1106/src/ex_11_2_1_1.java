
public class ex_11_2_1_1 {
	final static int N = 10;

	public static void main(String[] args) {
		int k=0;
		for (int j = 0; j < N; j++) {
			for (int i = 0; i < N - j; i++) {
				System.out.print("-");
			}

			for (int i = 0; i <= k; i++) {
				System.out.print("*");
			}
			k+=2;
			System.out.println();
			
			
		}

	}

}
