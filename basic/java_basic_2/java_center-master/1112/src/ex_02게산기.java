import org.omg.CORBA.PUBLIC_MEMBER;

public class ex_02게산기 {

	public static void main(String[] args) {

		// 1. 정수형 자료형을 출력값으로 돌려주는 add메소드 생성
		// -> 더하기 기능을 수행 매개변수로 정수형 데이터 2개를 받아옴
//2. 정수형 자료형을 출력값으로 돌려주는 minus메소드 생성
		// -> 더하기 기능을 수행 매개변수로 정수형 데이터 2개를 받아옴
		// 3. 정수형 자료형을 출력값으로 돌려주는 divide메소드 생성
		// -> 더하기 기능을 수행 매개변수로 정수형 데이터 2개를 받아옴
		// 4. 정수형 자료형을 출력값으로 돌려주는 multiple메소드 생성
		// -> 더하기 기능을 수행 매개변수로 정수형 데이터 2개를 받아옴
int age=45;
double number=0.41;

		try {
			System.out.println(add(12, 6));
			System.out.println(minus(12, 6));
			System.out.println(multiple(12, 6));
			System.out.println(divide(12, 6));
			System.out.printf("%4d \n", age);
			System.out.printf("%2.4f \n", number);
			System.out.println(divide(12, 0));

			
		} catch (ArithmeticException e) {
			System.out.print("0으로 나눌 수 없습니다.");

		}

	}

	public static int add(int m, int n) {
		int result = m + n;
		return result;
//		return m+n;

	}

	public static int minus(int m, int n) {
		int result = m - n;
		return result;
	}

	public static int divide(int m, int n) {
		int result = m / n;
		return result;
	}

	public static int multiple(int m, int n) {
		int result = m * n;
		return result;
	}

}
