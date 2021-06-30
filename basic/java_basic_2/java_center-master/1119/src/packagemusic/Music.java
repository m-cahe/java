package packagemusic;

public class Music {

	private String title;
	private String singer;
	private String path;

	public Music(String title, String singer, String path) {

		this.title = title;
		this.singer = singer;
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public String getPath() {
		return path;
	}

//매개변수3개짜리 생성자
//각각 필드 게터 

}
