package ans;

public class RPG extends Game {
	private String inventor;
	private String str;

	String getInventor() {
		return inventor;
	}

	RPG(String name, int age, String inventor, String str) {
		super(name, age);
		this.inventor = inventor;
		this.str = str;
	}
	
	void hint() {
		System.out.println("게임 출시된 지 " + getAge() + "년 되었고 " + "이 게임을 만든 사람은 " + getInventor() + "입니다.");
	}
	
	void quiz() {
		System.out.println("글자수 : " + getName().length());
		System.out.println("이 게임의 특징 : " + this.str);
	}
}