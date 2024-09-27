package 숙제;

public class Darkdesert extends RPG {
	private String story;

	Darkdesert(String name, int age, String inventor, String story) {
		super(name, age, inventor);
		this.story = story;
	}
	
	@Override
	void quiz() {
		super.quiz();
		System.out.println("이 게임의 특징 : " + this.story);
	}

	void quizDarkdesert() {
		System.out.println("글자수 : 4");
		System.out.println("이 게임의 특징 : " + this.story);
	}
}