
public class ex_09_4 {

	public static void main(String[] args) {

		int dan = 0;
		int num = 0;
		int result = 0;

		for (dan = 2; dan <= 9; dan++) {
			System.out.printf("%d´Ü : ", dan);
			for (num = 1; num <= 9; num++) {
				result = dan * num;
				System.out.printf("%d*%d=%d  ", dan, num, result);
				if (num == 9) {
					System.out.println();
				}
			}
		}

	}

}
