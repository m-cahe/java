package Pokemon;

public class gozi extends Pokemon {

	public gozi() {

		super.name = "����";// �θ�Ŭ���� �ʵ� ��Ī ����
		super.type = "��ö";
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
