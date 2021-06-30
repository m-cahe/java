package Game;

public interface IGame {

	void makeRandom();

	String getQuizMsg();

	boolean checkAnswer(int answer);
	// 다 추상메소드
}
