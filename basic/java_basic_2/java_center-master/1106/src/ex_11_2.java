
public class ex_11_2 {

	final static int N = 9;

	public static void main(String[] args) {

		int line = 0;//줄
		int star = 0;//아스타리카 갯수
		int blank = 0;//공백
		int linestar = 0;//줄에 할당된 아스타리카의 한계
		for (line = 1; line <= N; line++) {
			for (blank = N; blank > line; blank--) {
				System.out.print(" ");
			}
			for (star = 0; star <= linestar; star++) {
				System.out.print("*");
			}
			linestar++;
			System.out.print("\n");

		}

	}

}