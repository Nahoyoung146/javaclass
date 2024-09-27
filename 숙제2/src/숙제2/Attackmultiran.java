package 숙제2;

public class Attackmultiran extends Magic implements Attack{

	Attackmultiran(String name) {
		super(name);
	}

	public void skill(Character job1,Character job2) {
		int a = (int) (Math.random() * 6) + 1;
		job1.setAttack(job1.getAttack() * a);
		System.out.println("공력력 : " + job1.getAttack());
	}
}