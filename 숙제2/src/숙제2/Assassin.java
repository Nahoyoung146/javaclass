package 숙제2;

public class Assassin extends Character implements Health{

	Assassin(String name, String job, int health, int attack) {
		super(name, job, health, attack);
	}

	public void assassin(Character job1, Character job2) {
		job2.setHealth(job2.getHealth() / 10);
		System.out.println("상대 체력 : " + job2.getHealth());
	}
}