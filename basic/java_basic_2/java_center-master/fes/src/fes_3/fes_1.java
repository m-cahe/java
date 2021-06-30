package fes_3;

public class fes_1 {
	public static int findKim(String[] ㅏ) {
		int n=0;
		String[] names= {"Queen", "Tod", "Kim"};
		for(int i=0; i<names.length; i++) {
			if(names[i].equals("Kim")) {
				 n=i+1;
			}
		}
		return n;
	}
	
	
	
	public static void main(String[] args) {
		
		String[] names= {"Queen", "Tod", "Kim"};
		
		System.out.print("김서방은 "+findKim(names)+"에 있다.");

	}

}
