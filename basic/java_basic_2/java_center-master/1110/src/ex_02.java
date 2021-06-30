
public class ex_02 {

	public static void main(String[] args) {

		//타입 선언 레퍼런스변수 배열 타입동일 크기
		int[] numbers=new int[4];

		//베열 생성방법
		//자료형 [] 변수명 = new 자료형[배열의 크기]
		
		int[] array=new int [4];
		for(int i=0; i<array.length; i++) {
			array[i]=2*i;
			System.out.printf("%d ", array[i]);
		}
		//array는 배열의 주소를 참조하고있는 레퍼런스 변수이다.
		// 따라서 array를 출력 --> 주소값 출력
		
		//array의 첫번째 방에 44숫자 대입
		array[0]=44;
		System.out.printf("\n%d ", array[0]);
		//array 두번째 방에 17
		array[1]=17;
		System.out.printf("\n%d ", array[1]);
		
		array[2]=19;
		System.out.printf("\n%d ", array[2]);
		array[3]=24;
		System.out.printf("\n%d ", array[3]);
		
		
		try {array[4]=7;
		System.out.printf("\n%d ", array[4]);}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\n배열의 인덱스가 범위를 벗어났습니다.");
		}
		
		//정수형 변수 자료를 하나로 묶는 intArray 배열 생성
		int[] intArray=new int[3];
		//주소 값을 담을 수 있는 레퍼런스 변수만 선언된 상태!!!!!!!
		intArray[4]=44;
//		실제로 데이터를 저장할 수 있는 3개의 공간을 가진 배열 생성
		
		
	}
	

}
