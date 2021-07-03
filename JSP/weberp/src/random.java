
public class random {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*3);
		System.out.println(num);
		switch (num) {
		case 0:
			System.out.println("용돈 인상");
			break;
		case 1:
			System.out.println("문화상품권 10000원");
			break;
		case 2:
			System.out.println("일주일 컴퓨터 간섭 안하기");
			break;
		}
		
	}

}
