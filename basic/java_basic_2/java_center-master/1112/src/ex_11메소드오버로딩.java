
public class ex_11메소드오버로딩 {
	public static void main(String[] args) {
//한 클래스 내에서 매개변수의 개수나 타입이 다를때 메소드 이름을 중복해서 사용하는 것.
		int num1 = 10;
		int num2 = 5;
		int num3 = 3;
		double num4 = 3.32;
		System.out.println(add(num1, num2));
		System.out.println(add(num1, num2, num3));

	}

	public static int add(int n, int m) {
		return n + m;
	}

	public static int add(int n, int m, int l) {
		return n + m + l;
	}

	public static double add(double n, double m, double l) {
		return n + m + l;
	}

	public static double add(int a, int b, double c) {
		return a + b + c;
	}

	public static double add(int a, double b) {
		return a + b;
	}

	public static double add(double a, int b, double c) {
		return a + b + c;
	}

}
