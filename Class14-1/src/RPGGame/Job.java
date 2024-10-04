package RPGGame;

public class Job extends Character{
	private String job;
	private String skill;

	Job(String job, String skill, int health){
		super(health);
		this.job=job;
		this.skill=skill;
	}

	String getJob() {
		return job;
	}

	void printinfo() {
		System.out.println("직업 : " + this.job + ", 체력 : " + super.getHealth() + ", 레벨 : " + super.getLevel() + ", 경험치 : " + super.getExperience());
	}

	void attack() {
		System.out.print(job);
		super.attack();
	}

	void win() {
		int a=(int)(Math.random()*100)+1;
		setExperience (super.getExperience()+a);

		if(super.getExperience()>=100) {
			setLevel (super.getLevel()+1);
			setExperience (super.getExperience()-100);
			System.out.println(this.job + "(이) 경험치를 "+ a +" 획득했고 레벨이 "+ super.getLevel() + "이(가) 되었습니다!");
		}

		else {
			System.out.println(this.job + "가(이) 경험치를 "+ a +" 획득했습니다!");
		}
	}

	void skill() {
		System.out.print(job);
		super.attack(1000);
	}

	void monsterattack(Type type) {
		System.out.print(job);
		super.damage(type);
	}
}
