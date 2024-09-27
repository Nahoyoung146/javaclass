package 숙제2;

public class Reverseattack extends Trap implements Attack{

	Reverseattack(String name) {
		super(name);
	}

	public void skill(Character job1, Character job2) {
		job1.setHealth(job1.getHealth() + job2.getAttack());
		job2.setHealth(job2.getHealth() - job2.getAttack());
		System.out.println("본인 체력 : " + job1.getHealth() + ", 상대 체력 : " + job2.getHealth());
		job2.setAttack(job2.getNormalAtk());
	}
}