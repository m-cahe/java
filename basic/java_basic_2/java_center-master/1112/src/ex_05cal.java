
public class ex_05cal {

	public static void main(String[] args) {
		int num1 = 70;
		int num2 = 75;
		char op = '-';
		try {
			System.out.println(cal(num1, num2, op));
		} catch (ArithmeticException e) {
			System.out.print("0으로 나눌 수 없습니다.");
		}

	}

	public static int cal(int num1, int num2, char op) {
		int result = 0;
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1>num2?num1-num2:num2-num1;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}
		return result;
	}

}
