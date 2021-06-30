
public class ex_09_5 {

	public static void main(String[] args) {

		int dan = 0;
		int num = 0;
		int result = 0;
		for (num = 1; num <= 9; num++) {
			for (dan = 2; dan <= 9; dan++) {
				result = dan * num;
				System.out.printf("%d*%d=%d  ", dan, num, result);
				if (dan == 9) {
					System.out.println();
				}
			}
		}

	}

}
