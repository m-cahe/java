package ex_����;

public abstract class Creature {
	// ����
	// ����
	// x,y ��ġ int
	// boolean ô��

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

	// ��� �����ϴ¸޼ҵ� attack����Ÿ�� x
	// �ȴ� �޼ҵ� walk ����Ÿ�� x
	// ���̸Դ� �޼ҵ� age ����Ÿ��x ���� 1�� ���� �����ۼ�
	public abstract void attack();

	public abstract void walk();

	public void age() {
		age++;
	}

}
