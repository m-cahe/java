import java.util.Scanner;

public class ex_09_1_other {

	public static void main(String[] args) {
		//단 입력후 단 출력
		Scanner scanner=new Scanner(System.in);
		System.out.printf("단 입력 : ");
		int dan=scanner.nextInt();
		int[] danarr=new int[9];
		for (int i=0;i<danarr.length;i++) {
			danarr[i]=i+1;
			int result=dan*danarr[i];
			System.out.printf("%d*%d=%d\n",dan ,i+1,result);
			
		}
		
		
		

	}

}