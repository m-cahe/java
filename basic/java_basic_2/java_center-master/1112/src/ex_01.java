
public class ex_01 {

	public static void main(String[] args) {

		/*
		 * 메소드 기본구조 public 타입 메소드이름(파라미터) { 알고리즘 return;
		 * 
		 * } 2.주의사항 -return 한번만 가능하다. 메소드는 return키워드를만나는 순간 끝이난다. 3. 메소드 사용하는 방법 메소드의 이름
		 * 부르기
		 */
		System.out.println(add(5, 6));

	}

	// 메소드 쓰는 공간
	// 더하기 기능을 수행하는 메소드를 생성
	public static int add(int n, int m) {
		int result = n + m;
		return result;

	}

}
