package 숙제2;

public class Attackdouble extends Magic implements Attack{

	Attackdouble(String name) {
		super(name);
	}

	public void skill(Character job1, Character job2) {
		job1.setAttack(job1.getAttack() * 2);
		System.out.println("공격력 : " + job1.getAttack());
	}
}