
public class ex_01 {

	
	public static void main(String[] args) {
	
		
		//���� boolean
		boolean ans = true;
		//������ char
		char word = 'a';
		//������ int
		int num=14;
		long num4=142l;
		//�Ǽ��� double float
		double num2= .1234;
		float num3= 0.1234f;
		int a= 10;
		float b=a;
		String str=null;
		System.out.println(b);
		System.out.println(str);
		double c=.33;
		int d= (int) c;//(�ڷ���) ������ȯ
		//����(����)�� �ǹ� :  �����ʿ� �ִ� ���� �������� ����
		System.out.println(d);
		int nb=10;
		int nb1=7;
		System.out.println(nb/nb1);
		System.out.println(nb%nb1);
		float nb2=10.0f;
		float nb3=7.0f;
		System.out.println(nb2/nb3);
		System.out.println(nb2%nb3);
		System.out.println((int)(nb/nb3));
		String str1=8+" "+2;
		System.out.println(str1);
		String str2= ""+5+2;  //����+����=����
		System.out.println(str2);
	}

}
