package fes_fianl;

public class fes_27 {

	public static void main(String[] args) {
		System.out.println(change124(20));

	}

	public static String change124(int n) {
		String[] num = { "4", "1", "2" };
		String result = "";
		// 경우가 3개니까 switch?
		// 근데 n을 계속반복하자나
		// 반복문안에 switch? 만약 반복문이면 while써야함
		// while 쓰면 n 계산하고 어떻게 다시하지 3으로 다시 나누긴 하는데 안나온다
		// n=(n-1)/3으로 계산하면 나온다. 나머지가 0은 특수한 경우 3=3*1+0인데 10을 4로 통째로 보네
		while (n > 0) {
			result = num[n % 3] + result;// +=하면 순서바뀜
			n = (n - 1) / 3;
		}
		return result;

	}

}
