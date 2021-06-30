package ex_보충;

public abstract class animal extends Creature {

	public animal(int age, int x, int y, double length, boolean spine) {
		super(age, x, y, length, spine);

	}

	@Override
	public void attack() {
		System.out.println("이빨을 사용해서 공격");
	}

	@Override
	public void walk() {
		System.out.println("네 발로 걷기");
	}

}
