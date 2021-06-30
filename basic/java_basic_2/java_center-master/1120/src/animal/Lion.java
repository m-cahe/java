package animal;

public class Lion extends WildAnimal {
// hunt단독사냥
//	1. public String name="사자";

	
	//super.name = "사자";왜 이렇게 밖에있으면 오류가 나죠
	public void hunt() {
		super.name = "사자";

		System.out.println("단독 사냥하기");
	}

}
