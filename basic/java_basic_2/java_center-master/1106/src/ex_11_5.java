
public class ex_11_5 {

	public static void main(String[] args) {
		// 이등변 만들었으니까 반대로
		int line = 0;
		int star = 0;
		int blank = 0;
		int linestar = 0;
		int extraStar = 0;// 반대쪽 별갯수
		for (line = 1; line <= 10; line++) {
			for (blank = 5; blank >= linestar; blank--) {
				System.out.print(" ");
			}
			for (star = 0; star < extraStar; star++) {
				System.out.print("*");
			}
			System.out.print("\n");
			if (line <= 5) {
				linestar++;
				extraStar += 2;
			} else {
				linestar--;
				extraStar -= 2;
			}
		}

	}

}
