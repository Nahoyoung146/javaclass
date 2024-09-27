package 숙제2;

public class Attackhalfofenemy extends Trap implements Attack{

	Attackhalfofenemy(String name) {
		super(name);
	}
	
	public void skill(Character job1, Character job2) {
		job1.setAttack(job1.getAttack() + job2.getHealth() / 2);
		System.out.println("공격력 : " + job1.getAttack());
		job2.setAttack(job2.getNormalAtk());
	}
}