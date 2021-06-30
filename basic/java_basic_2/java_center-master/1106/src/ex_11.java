
public class ex_11 {

	final static int N = 5;

	public static void main(String[] args) {
		int i = 0; // i는 가로 ->뜻함
		int j = 0; // j는 세로
		for (i = 1; i <= N; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
