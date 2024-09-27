package 숙제;

public class Lostark extends RPG {
	private String dungeon;

	Lostark(String name, int age, String inventor, String dungeon) {
		super(name, age, inventor);
		this.dungeon = dungeon;
	}

	void hint() {
		System.out.println("게임 출시된 지 " + super.getAge() + "년 되었고 " + "이 게임을 만든 사람은 " + super.getInventor() + "입니다.");
	}

	void quizLostark() {
		System.out.println("글자수 : 5");
		System.out.println("이 게임의 특징 : " + this.dungeon);
	}
}