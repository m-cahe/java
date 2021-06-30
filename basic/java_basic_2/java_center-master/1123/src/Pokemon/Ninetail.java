package Pokemon;

public class Ninetail extends Pokemon {

	public Ninetail() {
		super();// Pokemon 생성자 가져오기(지금은 기본)
		super.name = "나인테일";// 부모클래스 필드 지칭 가능
		super.type = "불";
		super.hp = 700;
		super.atk = 159;
		super.def = 140;
	}

	@Override
	public int sAttack() {
		return 2 * super.atk;
	}

	@Override
	public String toString() {
		return "Ninetail [name=" + name + ", type=" + type + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}


}
