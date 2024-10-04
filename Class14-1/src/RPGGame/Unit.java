package RPGGame;

public class Unit {
	private int level;
	private int health;
	private int experience;
	private int damage = (int)(Math.random()*100)+1;

	Unit(){
		this.level=1;
		this.health=100;
	}

	Unit(int health){
		this.level=1;
		this.health=health;
	}

	Unit(int level, int health){
		this.level=level;
		this.health=health;
	}

	int getLevel() {
		return level;
	}

	void setLevel(int level) {
		this.level = level;
	}

	int getHealth() {
		return health;
	}

	void setHealth(int health) {
		this.health = health;
	}

	int getExperience() {
		return experience;
	}

	void setExperience(int experience) {
		this.experience = experience;
	}

	int getDamage() {
		return damage;
	}

	void attack() {
		damage =(int)(Math.random()*100)+1;
		System.out.println("가(이) 공격을 시전합니다! " + getDamage() + "의 피해를 입혔습니다!");
	}

	void attack(int atk) {
		damage =(int)(Math.random()*atk)+1;
		System.out.println("가(이) 공격을 시전합니다! " + getDamage() + "의 피해를 입혔습니다!");
	}

	void damage(Unit unit) {
		setHealth(this.getHealth()-unit.getDamage());
		System.out.println("의 체력 : " + getHealth());
	}
}