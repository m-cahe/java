package ex_����;

public abstract class animal extends Creature {

	public animal(int age, int x, int y, double length, boolean spine) {
		super(age, x, y, length, spine);

	}

	@Override
	public void attack() {
		System.out.println("�̻��� ����ؼ� ����");
	}

	@Override
	public void walk() {
		System.out.println("�� �߷� �ȱ�");
	}

}
