package ex_보충;

public abstract class Creature {
	// 나이
	// 길이
	// x,y 위치 int
	// boolean 척추

	int age, x, y;
	double length;
	boolean spine;

	public Creature(int age, int x, int y, double length, boolean spine) {
		this.age = age;
		this.x = x;
		this.y = y;
		this.length = length;
		this.spine = spine;
	}

	public int getAge() {
		return age;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getLength() {
		return length;
	}

	public boolean isCc() {
		return spine;
	}

	// 기능 공격하는메소드 attack리턴타입 x
	// 걷는 메소드 walk 리턴타입 x
	// 나이먹는 메소드 age 리턴타입x 나이 1씩 증가 로직작성
	public abstract void attack();

	public abstract void walk();

	public void age() {
		age++;
	}

}
