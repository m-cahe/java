package fes_fianl;

public class fes_bonus {

	
	
	
	public static void main(String[] args) {
		
		String[] names= { "Tod", "Kim","Queen"};
		
		System.out.print(findKim(names));

	}
	public static String findKim(String[] a) {
		int n=0;
		String result="";
		for(int i=0; i<a.length; i++) {
			if(a[i].equals("Kim")) {
				 n=i+1;
			}
		}
		result= "김서방은 "+n+"에 있다.";
		return result;
	}
	

}
