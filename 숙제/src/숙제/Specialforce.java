package 숙제;

public class Specialforce extends FPS {
	private String speed;

	Specialforce(String name, int age, int rank, String speed) {
		super(name, age, rank);
		this.speed = speed;
	}

	void hint() {
		System.out.println("게임 출시된 지 " + super.getAge() + "년 되었고 " + "이 게임의 순위는 " + super.getRank() + "입니다.");
	}

	void quizSpecialforce() {
		System.out.println("글자수 : 5");
		System.out.println("이 게임의 중요 요소 : " + this.speed);
	}
}