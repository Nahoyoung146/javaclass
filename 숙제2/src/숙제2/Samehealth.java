package 숙제2;

public class Samehealth extends Trap implements Health{

	Samehealth(String name) {
		super(name);
	}

	public void skill2(Character job1, Character job2) {
		job2.setHealth(job1.getHealth());
		System.out.println("본인 체력 : " + job1.getHealth() + ", 상대 체력 : " + job2.getHealth());
		job2.setAttack(job2.getNormalAtk());
	}
}