import java.util.Scanner;

public class ex_10_2 {

	
	
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num=scanner.nextInt();//입력한 정수
			int[] numarr=new int [num];//입력한 정수 배열 생성
			//배열에다 숫자 지정
			System.out.printf("%d의 약수 : ", num);
			for (int i=0;i<numarr.length;i++) {
				numarr[i]=i+1;
				if(num%numarr[i]==0) {
					System.out.printf("%d ",numarr[i]);
				}
			}

	}

}
