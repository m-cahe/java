package Pokemon;

public class pizon2 extends Pokemon {

	public pizon2() {
		super();// Pokemon ������ ��������(������ �⺻)
		super.name = "������";// �θ�Ŭ���� �ʵ� ��Ī ����
		super.type = "����";
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
