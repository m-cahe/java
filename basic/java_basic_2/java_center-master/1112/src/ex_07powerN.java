
public class ex_07powerN {

	public static void main(String[] args) {

		int base = 3;
		int n = 2;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}
	public static int powerN(int a, int b) {
		int multiple = 1;
		for (int i = 0; i < b; i++) {
			multiple *= a;
		}
		return multiple;
	}

}
