
public class ex_01 {

	
	public static void main(String[] args) {
	
		
		//논리형 boolean
		boolean ans = true;
		//문자형 char
		char word = 'a';
		//정수형 int
		int num=14;
		long num4=142l;
		//실수형 double float
		double num2= .1234;
		float num3= 0.1234f;
		int a= 10;
		float b=a;
		String str=null;
		System.out.println(b);
		System.out.println(str);
		double c=.33;
		int d= (int) c;//(자료형) 강제변환
		//대입(저장)의 의미 :  오른쪽에 있는 값을 왼쪽으로 대입
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
		String str2= ""+5+2;  //문자+숫자=문자
		System.out.println(str2);
	}

}
