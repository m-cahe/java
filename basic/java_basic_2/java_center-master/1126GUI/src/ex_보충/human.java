package ex_����;

public abstract class human extends Creature implements Talkable, Codable, Swimmable {

	public human(int age, int x, int y, double length, boolean spine) {
		super(age, x, y, length, spine);
	}

	@Override
	public void attack() {
		System.out.println("���� ����ؼ� ����!!");
	}

	@Override
	public void walk() {
		System.out.println("���� ����!!");
	}

	@Override
	public void talk() {
		System.out.println("���ϱ�!!");

	}

}
