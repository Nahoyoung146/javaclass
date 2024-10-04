package RPGGame;

public class Character extends Unit {
	private String name = "모험가";

	Character(int health) {
		super(health);
	}

	String getJob() {
		return name;
	}

	void printinfo() {
		System.out.println("직업 : " + this.name + ", 체력 : " + super.getHealth() + ", 레벨 : " + super.getLevel()
		+ ", 경험치 : " + super.getExperience());
	}

	void attack() {
		super.attack();
	}

	void skill() {
		super.attack(1000);
	}

	void win() {
		int a = (int) (Math.random() * 100) + 1;
		setExperience(super.getExperience() + a);

		if (super.getExperience() >= 100) {
			setLevel(super.getLevel() + 1);
			setExperience(super.getExperience() - 100);
			System.out.println(this.name + "(이) 경험치를 " + a + " 획득했고 레벨이 " + super.getLevel() + "이(가) 되었습니다!");
		}

		else {
			System.out.println(this.name + "가(이) 경험치를 " + a + " 획득했습니다!");
		}
	}

	void monsterattack(Type type) {
		System.out.print(name);
		super.damage(type);
	}
}
