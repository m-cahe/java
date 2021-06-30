package Pokemon;

public class pizon2 extends Pokemon {

	public pizon2() {
		super();// Pokemon 생성자 가져오기(지금은 기본)
		super.name = "피존투";// 부모클래스 필드 지칭 가능
		super.type = "비행";
		super.hp = 740;
		super.atk = 148;
		super.def = 139;
	}

	@Override
	public int sAttack() {
		return 2 * super.atk;
	}

	@Override
	public String toString() {
		return "pizon2 [name=" + name + ", type=" + type + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}
}
