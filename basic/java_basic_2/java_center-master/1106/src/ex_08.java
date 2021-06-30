import java.util.Scanner;

public class ex_08 {
	/* 문자열 자료형 String 문자 자료형 char
	 * 1 단일 문자 2. ''사용 3. 아스키 코드 형태로 숫자로 취급
	 * */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작 알파벳 입력 : ");
		String startAlpha = scanner.next();
		System.out.print("마지막 알파벳 입력 : ");
		String finishAlpha = scanner.next();
		char startAlphaFirst = startAlpha.charAt(0);
		char finishAlphaFirst = finishAlpha.charAt(0);
		char[] arr = new char[26];
		//a~z까지 출력하기
		System.out.print("알파벳 출력 : ");
		for (int i=0;i<arr.length;i++) {
			arr[i]=(char)('a'+i);
			if(arr[i] <startAlphaFirst || finishAlphaFirst <arr[i]) {
				continue;
			}
			System.out.printf("%s ", arr[i]);
		}
	}

}
