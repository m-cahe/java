
public class ex_4expressions2 {
	public static void main(String[] args) {
		System.out.println(expressions(15));
	}

	public static int expressions(int n) {
		int result = 0;
		for (int j = 1; j <= n; j++) {
			int sum = 0;
			int num = j;
			while (num <= n) {
				sum += num;
				num++;
				if (sum == n) {
					result++;
					break;
				}

			}
		}
		return 0;
	}
}