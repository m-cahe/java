
public class star {



	public static void main(String[] args) {
		int k = 0;
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3 - j + 9; i++) {
				System.out.print(" ");
			}

			for (int i = 0; i <= k; i++) {
				System.out.print("*");
			}
			k += 2;
			System.out.println();

		}
		int i = 0;
		int j = 0;
		int l = 3;
		for (j = 3; j < 10; j++) {
			for (i = 0; i < l; i++) {
				System.out.print(" ");
			}
			for (i = 25; i > k; i--) {
				System.out.print("*");
			}

			System.out.println();
			if (j <= 5) {
				k += 2;
				l++;
			} else if (j > 5) {
				l--;
				k -= 2;
			}
		}
		k=5;
	
		for (j = 10; j <= 12; j++) {
			for (i = 0; i < j ; i++) {
				System.out.print(" ");
			
			}

			for (i = k; i >0; i--) {
				System.out.print("*");
			}
			k -= 2;
			System.out.println();

		}

	}
}
