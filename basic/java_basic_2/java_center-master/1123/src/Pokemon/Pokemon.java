package Pokemon;

public abstract class Pokemon {
	protected String name;
	protected String type;
	protected int hp;
	protected int atk;
	protected int def;

	public int attack() {
		return atk;
	}
//�߻�޼ҵ� Ư¡
//1. ������ ����. 
//2. �߻�޼ҵ�� �߻�Ŭ���������� ���ȴ�.
	//3. �������� ������
	//Ŭ�������� �������� ã�Ƴ��� ������ ������ ����� �۾�
	//��Ӱ��迡�� ����Ŭ������ �ݵ�� �����ؾ����� �˸���
	//��ü ���� X 

	public abstract int sAttack();
}
