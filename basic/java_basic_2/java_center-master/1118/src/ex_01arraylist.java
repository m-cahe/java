import java.util.ArrayList;

public class ex_01arraylist {
	public static void main(String[] args) {

		
		//배열의 단점 크기를 바꿀수 없다.
		//ArrayList
		
		ArrayList<Integer> drink=new ArrayList<Integer>();
		drink.add(1);
		drink.add(2);
		drink.add(3);
//		drink[3]="ZICO";
		/*
		 * for (int i = 0; i < drink.length; i++) { System.out.println(drink[i]); }
		 */
		//Arraylist<클래스이름>
		ArrayList<String> snack=new ArrayList<String>();
		snack.add("뿌셔뿌셔딸기맛");
		snack.add("첵스파맛");
		snack.add("수미칩");
		snack.add("엄마손파이");
		snack.add(1,"맛동산");
	
		snack.remove(2);
		snack.clear();
		for (int i = 0; i < snack.size(); i++) {
			System.out.println(snack.get(i));
		}
		
		
		//크기가 지정되지않음 가변배열
		}
}
