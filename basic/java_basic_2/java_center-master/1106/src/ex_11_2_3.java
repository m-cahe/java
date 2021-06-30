
public class ex_11_2_3 {

	final static int N = 10;

	public static void main(String[] args) {

		int line = 0;
		int star = 0;
		int blank = 0;
		int lineStar = 1;
		int extraStar = 0;// 반대쪽 별갯수
		for (line = 1; line <= N; line++) {
			for (blank = 5; blank > lineStar; blank--) {
				System.out.print(" ");
			}
			for (star = 0; star <= extraStar; star++) {
				System.out.print("*");
			}
			System.out.print("\n");
			if (line < 5) {
				lineStar++;
				extraStar+=2;
			} else {
				lineStar--;
				extraStar-=2;
			}
		}

	}

}
