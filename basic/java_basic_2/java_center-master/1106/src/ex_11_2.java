
public class ex_11_2 {

	final static int N = 9;

	public static void main(String[] args) {

		int line = 0;//��
		int star = 0;//�ƽ�Ÿ��ī ����
		int blank = 0;//����
		int linestar = 0;//�ٿ� �Ҵ�� �ƽ�Ÿ��ī�� �Ѱ�
		for (line = 1; line <= N; line++) {
			for (blank = N; blank > line; blank--) {
				System.out.print(" ");
			}
			for (star = 0; star <= linestar; star++) {
				System.out.print("*");
			}
			linestar++;
			System.out.print("\n");

		}

	}

}