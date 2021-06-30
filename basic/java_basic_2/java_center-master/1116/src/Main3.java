
public class Main3 {

	public static void main(String[] args) {

		PiggyBank pig = new PiggyBank();
		pig.setMoney(1000);
		pig.showMoney();
		pig.deposit(2000);
		pig.showMoney();
		pig.withDraw(1500);
		pig.showMoney();

	}

}
