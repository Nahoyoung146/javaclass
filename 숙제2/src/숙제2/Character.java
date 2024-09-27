package 숙제2;

public class Character extends Card {
	private String job;
	private int health;
	private int attack;
	private int normalAtk;

	Character(String name, String job, int health, int attack) {
		super(name);
		this.job = job;
		this.health = health;
		this.attack = attack;
		this.normalAtk = attack;
	}

	int getNormalAtk() {
		return normalAtk;
	}

	String getJob() {
		return job;
	}

	int getHealth() {
		return health;
	}

	int getAttack() {
		return attack;
	}

	void setHealth(int health) {
		this.health = health;
	}

	void setAttack(int attack) {
		this.attack = attack;
	}

	void Attack(Character job) {
		System.out.println(this.job + "이(가) " + this.attack + "의 피해를 입혔습니다.");
		job.setHealth(job.getHealth() - this.getAttack());
		System.out.println("상대 체력 : " + job.getHealth());
	}

	public String toString() {
		return "직업 : " + getJob() + ", 체력 : " + getHealth() + ", 공격력 : " + getAttack();

	}

	public void skill(Character character, Character character2) {

	}

	public void skill2(Character character, Character character2) {

	}
}