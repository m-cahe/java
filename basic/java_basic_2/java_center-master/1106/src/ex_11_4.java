
public class ex_11_4 {

	public static void main(String[] args) {
		// 먼저 이등변 만들자
		int line = 0;
		int star = 0;
		int blank = 0;
		int lineChange = 1;
		int extraStar = 0;// 반대쪽 별갯수
		for (line = 1; line <= 10; line++) {
			for (blank = 5; blank > lineChange; blank--) {
				System.out.print(" ");
			}
			for (star = 0; star <= extraStar; star++) {
				System.out.print("*");
			}
			System.out.print("\n");
			if (line < 5) {
				lineChange++;
				extraStar++;
			} else {
				lineChange--;
				extraStar--;
			}
		}

	}

}
