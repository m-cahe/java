
public class PiggyBank {

	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void deposit(int money) {
		this.money += money;
		System.out.printf("���� �Աݾ��� %d���Դϴ�.\n", money);
	}

	public void withDraw(int money) {
		this.money -= money;
		System.out.printf("���� ��ݾ��� %d���Դϴ�.\n", money);
	}

	public void showMoney() {
		System.out.printf("�ܾ��� %d���Դϴ�.\n", money);
	}

}
