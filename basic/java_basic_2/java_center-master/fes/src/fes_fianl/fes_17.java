package fes_fianl;

public class fes_17 {

	public static void main(String[] args) {
		int n = CollatzNumber(20);
		System.out.println(n);

	}

	public static int CollatzNumber(int n) {
		int k = 0;// È½¼ö
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
				k++;
			} else {
				n = 3 * n + 1;
				k++;
			}
			if (k > 500) {
				k = -1;
				break;
			}
		}
		return k;
	}
}
