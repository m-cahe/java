package fes_fianl;

public class fes_27 {

	public static void main(String[] args) {
		System.out.println(change124(20));

	}

	public static String change124(int n) {
		String[] num = { "4", "1", "2" };
		String result = "";
		// ��찡 3���ϱ� switch?
		// �ٵ� n�� ��ӹݺ����ڳ�
		// �ݺ����ȿ� switch? ���� �ݺ����̸� while�����
		// while ���� n ����ϰ� ��� �ٽ����� 3���� �ٽ� ������ �ϴµ� �ȳ��´�
		// n=(n-1)/3���� ����ϸ� ���´�. �������� 0�� Ư���� ��� 3=3*1+0�ε� 10�� 4�� ��°�� ����
		while (n > 0) {
			result = num[n % 3] + result;// +=�ϸ� �����ٲ�
			n = (n - 1) / 3;
		}
		return result;

	}

}
