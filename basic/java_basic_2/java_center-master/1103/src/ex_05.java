import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Java 점수 입력 : ");
		int javaScore=scanner.nextInt();
		System.out.print("Web 점수 입력 : ");
		int webScore=scanner.nextInt();
		System.out.print("Android 점수 입력 : ");
		int androidScore=scanner.nextInt();
		System.out.println("합계 : "+(javaScore+webScore+androidScore));
		System.out.print("평균 : "+(javaScore+webScore+androidScore)/3);
		scanner.close();
		
		
		
		
	}

}
