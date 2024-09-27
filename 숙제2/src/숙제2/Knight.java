package 숙제2;

public class Knight extends Character implements Health{

	Knight(String name, String job, int health, int attack) {
		super(name, job, health, attack);
	}

	public void skill2(Character job1, Character job2) {
		job1.setHealth(job1.getHealth() * 2);
		System.out.println("체력 : " + job1.getHealth());
	}
}