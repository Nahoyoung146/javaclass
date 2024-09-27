package 숙제2;

public class Healthtriple extends Magic implements Health{

	Healthtriple(String name) {
		super(name);
	}

	public void skill2(Character job1, Character job2) {
		job1.setHealth(job1.getHealth() * 3);
		System.out.println("체력 : " + job1.getHealth());
	}
}