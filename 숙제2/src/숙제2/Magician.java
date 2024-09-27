package 숙제2;

public class Magician extends Character implements Attack{

	Magician(String name, String job, int health, int attack) {
		super(name, job, health, attack);
	}

	public void skill(Character job1, Character job2) {
		System.out.println("직업 스킬로 인해서 한번 더 공격합니다.");
		super.Attack(job2);
	}
}