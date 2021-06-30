package StudentScorepack;

public class studentScore {

	private String name;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;

	public studentScore(String name, int scoreJava, int scoreWeb, int scoreAndroid) {

		this.name = name;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public String getName() {
		return name;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public int sum() {
		int sum = scoreJava + scoreAndroid + scoreWeb;
		return sum;
	}

	public double avg() {
		double avg = (double) (sum() / 3);
		return avg;
	}

}
