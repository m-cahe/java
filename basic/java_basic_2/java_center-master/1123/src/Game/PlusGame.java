package Game;

public class PlusGame implements IGame {
	int a, b;
	String result;

	@Override
	public void makeRandom() {
		// ���ڸ� ������ �ΰ� �� ���� �����
		a = (int) (Math.random() * 9 + 1);
		b = (int) (Math.random() * 9 + 1);

	}

	@Override
	public String getQuizMsg() {
		// �ΰ��� ������ ���ؼ� �������
		String result = String.format("%d+%d= ", a, b);
		return result;// result�� sysout���� ���
	}

	@Override
	public boolean checkAnswer(int answer) {
		// ����Ȯ�� answer�� ������ �ΰ��� ������ �� ��
		return (answer == (a + b));

	}

}
