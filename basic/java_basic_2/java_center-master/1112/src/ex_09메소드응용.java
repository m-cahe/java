
public class ex_09메소드응용 {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
//		System.out.println(divisor);
//		System.out.println(getSum(7));
//		System.out.println(getSum(6));
//		System.out.println(getSum(10));
//		
//		System.out.println(isPerfect(6));
//		System.out.println(isPerfect(28));
//		System.out.println(isPerfect(496));
//		System.out.println(isPerfect(8128));
//		System.out.println(isPerfect(8127));

//		System.out.println(isPrimeNum(7));
//		System.out.println(isPrimeNum(8));
//		System.out.println(isPrimeNum(9));
//		System.out.println(isPrimeNum(91));
//		System.out.println(isPrimeNum(113));
//		System.out.println(isPrimeNum(15842));

		System.out.print("==================\n");

	}

	public static boolean isDivisor(int n, int m) {
		return n % m == 0;
	}

	public static int getSum(int n) {

		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (isDivisor(n, i)) {
				sum += i;
			}
		}
		return sum;
	}

	public static boolean isPerfect(int n) {

		return getSum(n) == n;

	}

	public static boolean isPrimeNum(int n) {

		return getSum(n) == 1;
	}

}
