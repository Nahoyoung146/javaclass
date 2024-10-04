package RPGGame;

public class Type extends Unit{
	private String name;
	private String type;

	Type(String name, String type, int level, int health){
		super(level, health);
		this.name=name;
		this.type=type;
	}

	String getName() {
		return name;
	}

	void printinfo() {
		System.out.println("이름 : " + this.name  + ", 종족 : " + this.type + ", 레벨 : " + super.getLevel() + ", 체력 : " + super.getHealth());
	}

	void attack() {
		System.out.print(name);
		super.attack(50);
	}

	void normalattack(Character job) {
		System.out.print(name);
		super.damage(job);
	}

	void skillattack(Character job) {
		System.out.print(name);
		super.damage(job);
	}
}