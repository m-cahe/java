
public class ex_11_2_1 {

	final static int N = 10;

	public static void main(String[] args) {
//�̵
		int line = 0;// ��
		int star = 0;// �ƽ�Ÿ��ī ����
		int blank = 0;// ����
		int lineStar = 0;// �ٿ� �Ҵ�� �ƽ�Ÿ��ī�� �Ѱ�
		for (line = 1; line <= N; line++) {
			for (blank = N; blank > line; blank--) {
				System.out.print(" ");
			}
			for (star = 0; star <= lineStar; star++) {
				System.out.print("*");
			}
			lineStar += 2;
			System.out.print("\n");

		}

	}

}