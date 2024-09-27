package 숙제;

public class Overwatch extends FPS {
	private String calm;

	Overwatch(String name, int age, int rank, String calm) {
		super(name, age, rank);
		this.calm = calm;
	}

	void hint() {
		System.out.println("게임 출시된 지 " + super.getAge() + "년 되었고 " + "이 게임의 순위는 " + super.getRank() + "입니다.");
	}

	void quizOverwatch() {
		System.out.println("글자수 : 4");
		System.out.println("이 게임의 중요 요소 : " + this.calm);
	}
}