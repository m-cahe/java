import org.omg.CORBA.PUBLIC_MEMBER;

public class ex_02�Ի�� {

	public static void main(String[] args) {

		// 1. ������ �ڷ����� ��°����� �����ִ� add�޼ҵ� ����
		// -> ���ϱ� ����� ���� �Ű������� ������ ������ 2���� �޾ƿ�
//2. ������ �ڷ����� ��°����� �����ִ� minus�޼ҵ� ����
		// -> ���ϱ� ����� ���� �Ű������� ������ ������ 2���� �޾ƿ�
		// 3. ������ �ڷ����� ��°����� �����ִ� divide�޼ҵ� ����
		// -> ���ϱ� ����� ���� �Ű������� ������ ������ 2���� �޾ƿ�
		// 4. ������ �ڷ����� ��°����� �����ִ� multiple�޼ҵ� ����
		// -> ���ϱ� ����� ���� �Ű������� ������ ������ 2���� �޾ƿ�
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
			System.out.print("0���� ���� �� �����ϴ�.");

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
