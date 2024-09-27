package 숙제;

public class Dota extends RTS {
	private String player3;

	Dota(String name, int age, String speices, String player3) {
		super(name, age, speices);
		this.player3 = player3;
	}

	void hint() {
		System.out.println("게임 출시된 지 " + super.getAge() + "년 되었고 " + "이 게임의 종족은 " + super.getSpecies() + "가(이) 있습니다.");
	}

	void quizDota() {
		System.out.println("글자수 : 2");
		System.out.println("이 게임의 유명한 선수 : " + this.player3);
	}
}