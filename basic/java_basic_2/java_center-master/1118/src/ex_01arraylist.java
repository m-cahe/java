import java.util.ArrayList;

public class ex_01arraylist {
	public static void main(String[] args) {

		
		//�迭�� ���� ũ�⸦ �ٲܼ� ����.
		//ArrayList
		
		ArrayList<Integer> drink=new ArrayList<Integer>();
		drink.add(1);
		drink.add(2);
		drink.add(3);
//		drink[3]="ZICO";
		/*
		 * for (int i = 0; i < drink.length; i++) { System.out.println(drink[i]); }
		 */
		//Arraylist<Ŭ�����̸�>
		ArrayList<String> snack=new ArrayList<String>();
		snack.add("�ѼŻѼŵ����");
		snack.add("ý���ĸ�");
		snack.add("����Ĩ");
		snack.add("����������");
		snack.add(1,"������");
	
		snack.remove(2);
		snack.clear();
		for (int i = 0; i < snack.size(); i++) {
			System.out.println(snack.get(i));
		}
		
		
		//ũ�Ⱑ ������������ �����迭
		}
}
