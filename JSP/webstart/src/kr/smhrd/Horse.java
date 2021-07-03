package kr.smhrd;

import java.util.Random;

public class Horse {
	String name;
	int distance;
	boolean isEnd = false;
	static int rank = 0;

	Horse(String name) {
		this.name = name;
	}

	public void runHorse() {
		if (!this.isEnd) {
			this.distance = this.distance + (int) Math.floor(Math.random() * 100); // �� �ϸ��� 0~100 ������ �����Ǹ� �޸� �Ÿ��� ���� ����.
			System.out.println(this.name + " : " + this.distance);
			this.checkEnd(); // �޸� ���� �Ÿ��� 1000 �̻��̸� �ش� ��ü�� isEnd�� True�� �ٲ��ִ� �޼ҵ带 �Ź� üũ (���ӿ��� isLive üũ�� ����)
		}
	}

	public void checkEnd() {
		if (distance >= 1000) {
			isEnd = true;
			Horse.rank++;
			System.out.println(this.name + " is goal" + " rank" + Horse.rank);
		}
	}

	public void run() {
		Random r = new Random();
		for (int i = 0; i < 99999; i++) {
			this.runHorse();
			if (this.isEnd) {
				break;
			}
			int sleepTime = r.nextInt(10) * 1000 + 300;
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
			}
		}
	}
}