
public class random {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*3);
		System.out.println(num);
		switch (num) {
		case 0:
			System.out.println("�뵷 �λ�");
			break;
		case 1:
			System.out.println("��ȭ��ǰ�� 10000��");
			break;
		case 2:
			System.out.println("������ ��ǻ�� ���� ���ϱ�");
			break;
		}
		
	}

}
