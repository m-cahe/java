
public class ex_09_3_other {

	public static void main(String[] args) {
		int[] dan=new int[8];
		int[] backnum=new int[9];
		for(int i=0; i<dan.length;i++) {
			dan[i]=i+2;
			System.out.printf("==%d´Ü==\n", dan[i]);
			for(int j=0;j<backnum.length;j++) {
				backnum[j]=j+1;
				int result=dan[i]*backnum[j];
				System.out.printf("%d*%d=%d\n", dan[i], backnum[j], result);
				if(j==8) {
					System.out.printf("\n");
				}
			}
		}

	}

}