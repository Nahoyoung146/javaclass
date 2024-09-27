package 숙제;

public class RPG extends Game {
	private String inventor;

	String getInventor() {
		return inventor;
	}

	RPG(String name, int age, String inventor) {
		super(name, age);
		this.inventor = inventor;
	}
	
	void hint() {
		System.out.println("게임 출시된 지 " + getAge() + "년 되었고 " + "이 게임을 만든 사람은 " + getInventor() + "입니다.");
	}
	
	void quiz() {
		System.out.println("글자수 : 4");
	}
}