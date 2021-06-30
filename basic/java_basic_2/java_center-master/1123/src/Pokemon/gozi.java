package Pokemon;

public class gozi extends Pokemon {

	public gozi() {

		super.name = "고지";// 부모클래스 필드 지칭 가능
		super.type = "강철";
		super.hp = 708;
		super.atk = 124;
		super.def = 202;
	}

	@Override
	public String toString() {
		return "gozi [name=" + name + ", type=" + type + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}

	@Override
	public int sAttack() {
		// TODO Auto-generated method stub
		return 2 * atk;
	}

}
