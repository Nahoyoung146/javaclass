package 숙제;

public class Maple extends RPG {
	private String job;

	Maple(String name, int age, String inventor, String job) {
		super(name, age, inventor);
		this.job = job;
	}

	void hint() {
		System.out.println("게임 출시된 지 " + super.getAge() + "년 되었고 " + "이 게임을 만든 사람은 " + super.getInventor() + "입니다.");
	}

	void quizMaple() {
		System.out.println("글자수 : 6");
		System.out.println("이 게임의 특징 : " + this.job);
	}
}