import Pokemon.Ninetail;
import Pokemon.Pokemon;
import Pokemon.gozi;
import Pokemon.pizon2;

public class main {
	public static void main(String[] args) {
		// 부모클래스에서 상속받은 자식클래스가 여러개 있을대
		// 부모클래스 형태로 인스턴스를 생성하면
		// 부모클래스 배열로 데이터를 다룰수 있음
		// Object는 맨 위 수퍼클래스
		Pokemon[] pk = new Pokemon[3];

		
		
		Pokemon nT = new Ninetail();
		Pokemon p2 = new pizon2();
		Pokemon gz = new gozi();
		pk[0] = nT;
		pk[1] = p2;
		pk[2] = gz;
		for (int i = 0; i < pk.length; i++) {
			System.out.println(pk[i].toString());
		}

	}
}
