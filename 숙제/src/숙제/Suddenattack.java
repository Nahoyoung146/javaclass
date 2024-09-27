package 숙제;

public class Suddenattack extends FPS {
	private String aim;

	Suddenattack(String name, int age, int rank, String aim) {
		super(name, age, rank);
		this.aim = aim;
	}

	void hint() {
		System.out.println("게임 출시된 지 " + super.getAge() + "년 되었고 " + "이 게임의 순위는 " + super.getRank() + "입니다.");
	}

	void quizSuddenattack() {
		System.out.println("글자수 : 4");
		System.out.println("이 게임의 중요 요소 : " + this.aim);
	}
}