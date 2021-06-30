
public class ex_4expressions {

	public static void main(String[] args) {
		System.out.println(expressions(3));
	}
	public static int expressions(int n) {
		int k = 0;
		for (int i = 1; i < n + 1; i += 2) {
			if (n % i == 0) {
				k++;
			}
		}
		return k;
	}
}