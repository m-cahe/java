
public class ex_02 {

	public static void main(String[] args) {

		//Ÿ�� ���� ���۷������� �迭 Ÿ�Ե��� ũ��
		int[] numbers=new int[4];

		//���� �������
		//�ڷ��� [] ������ = new �ڷ���[�迭�� ũ��]
		
		int[] array=new int [4];
		for(int i=0; i<array.length; i++) {
			array[i]=2*i;
			System.out.printf("%d ", array[i]);
		}
		//array�� �迭�� �ּҸ� �����ϰ��ִ� ���۷��� �����̴�.
		// ���� array�� ��� --> �ּҰ� ���
		
		//array�� ù��° �濡 44���� ����
		array[0]=44;
		System.out.printf("\n%d ", array[0]);
		//array �ι�° �濡 17
		array[1]=17;
		System.out.printf("\n%d ", array[1]);
		
		array[2]=19;
		System.out.printf("\n%d ", array[2]);
		array[3]=24;
		System.out.printf("\n%d ", array[3]);
		
		
		try {array[4]=7;
		System.out.printf("\n%d ", array[4]);}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\n�迭�� �ε����� ������ ������ϴ�.");
		}
		
		//������ ���� �ڷḦ �ϳ��� ���� intArray �迭 ����
		int[] intArray=new int[3];
		//�ּ� ���� ���� �� �ִ� ���۷��� ������ ����� ����!!!!!!!
		intArray[4]=44;
//		������ �����͸� ������ �� �ִ� 3���� ������ ���� �迭 ����
		
		
	}
	

}
