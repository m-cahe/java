package Pokemon;

public class Ninetail extends Pokemon {

	public Ninetail() {
		super();// Pokemon ������ ��������(������ �⺻)
		super.name = "��������";// �θ�Ŭ���� �ʵ� ��Ī ����
		super.type = "��";
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
