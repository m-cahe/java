import java.util.Scanner;

public class ex_08 {
	/* ���ڿ� �ڷ��� String ���� �ڷ��� char
	 * 1 ���� ���� 2. ''��� 3. �ƽ�Ű �ڵ� ���·� ���ڷ� ���
	 * */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���ĺ� �Է� : ");
		String startAlpha = scanner.next();
		System.out.print("������ ���ĺ� �Է� : ");
		String finishAlpha = scanner.next();
		char startAlphaFirst = startAlpha.charAt(0);
		char finishAlphaFirst = finishAlpha.charAt(0);
		char[] arr = new char[26];
		//a~z���� ����ϱ�
		System.out.print("���ĺ� ��� : ");
		for (int i=0;i<arr.length;i++) {
			arr[i]=(char)('a'+i);
			if(arr[i] <startAlphaFirst || finishAlphaFirst <arr[i]) {
				continue;
			}
			System.out.printf("%s ", arr[i]);
		}
	}

}
