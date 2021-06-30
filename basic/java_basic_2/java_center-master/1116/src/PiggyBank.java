
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
		System.out.printf("현재 입금액은 %d원입니다.\n", money);
	}

	public void withDraw(int money) {
		this.money -= money;
		System.out.printf("현재 출금액은 %d원입니다.\n", money);
	}

	public void showMoney() {
		System.out.printf("잔액은 %d원입니다.\n", money);
	}

}
