package 숙제;

public class Starcraft extends RTS {
	private String player1;

	Starcraft(String name, int age, String speices, String player1) {
		super(name, age, speices);
		this.player1 = player1;
	}

	void hint() {
		System.out.println("게임 출시된 지 " + super.getAge() + "년 되었고 " + "이 게임의 종족은 " + super.getSpecies() + "가(이) 있습니다.");
	}

	void quizStarcraft() {
		System.out.println("글자수 : 6");
		System.out.println("이 게임의 유명한 선수 : " + this.player1);
	}
}