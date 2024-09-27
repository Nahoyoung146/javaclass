package 숙제;

public class Warcraft extends RTS {
	private String player2;

	Warcraft(String name, int age, String speices, String player2) {
		super(name, age, speices);
		this.player2 = player2;
	}

	void hint() {
		System.out.println("게임 출시된 지 " + super.getAge() + "년 되었고 " + "이 게임의 종족은 " + super.getSpecies() + "가(이) 있습니다.");
	}

	void quizWarcraft() {
		System.out.println("글자수 : 5");
		System.out.println("이 게임의 유명한 선수 : " + this.player2);
	}
}