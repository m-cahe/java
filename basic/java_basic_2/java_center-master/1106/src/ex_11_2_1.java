
public class ex_11_2_1 {

	final static int N = 10;

	public static void main(String[] args) {
//이등변
		int line = 0;// 줄
		int star = 0;// 아스타리카 갯수
		int blank = 0;// 공백
		int lineStar = 0;// 줄에 할당된 아스타리카의 한계
		for (line = 1; line <= N; line++) {
			for (blank = N; blank > line; blank--) {
				System.out.print(" ");
			}
			for (star = 0; star <= lineStar; star++) {
				System.out.print("*");
			}
			lineStar += 2;
			System.out.print("\n");

		}

	}

}