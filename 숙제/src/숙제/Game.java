package 숙제;

public class Game {
	private String name;
	private int age;

	Game() {
		this.name = "알 수 없음";
		this.age = 0;
	}

	Game(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
}