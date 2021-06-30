
public class ex_06정수10에더가까운수 {

	public static void main(String[] args) {

		System.out.println(close10(9, 12));

	}

	public static int close10(int n, int m) {
		int result = Math.abs(n - 10) > Math.abs(m - 10) ? m : n;
		if (Math.abs(n - 10) == Math.abs(m - 10)) {
			result = 0;
		}
		return result;
	}

}
