package Game;

public class PlusGame implements IGame {
	int a, b;
	String result;

	@Override
	public void makeRandom() {
		// 한자리 정수의 두개 의 난수 만들기
		a = (int) (Math.random() * 9 + 1);
		b = (int) (Math.random() * 9 + 1);

	}

	@Override
	public String getQuizMsg() {
		// 두개의 정수를 더해서 문제출력
		String result = String.format("%d+%d= ", a, b);
		return result;// result가 sysout으로 출력
	}

	@Override
	public boolean checkAnswer(int answer) {
		// 문제확인 answer와 랜덤한 두개의 숫자의 합 비교
		return (answer == (a + b));

	}

}
