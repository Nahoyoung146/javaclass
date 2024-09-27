
public class Player {
	String name;
	int level;
	int experience;
	
	Player() {//기본생성자
		this.name= "알 수 없음";
		this.level=1;
		this.experience=0;
	}
	
	Player(String name) {
		this.name= name;
		this.level=1;
		this.experience=0;
	}
	
	Player(String name, int level, int experience) {
		this.name= name;
		this.level=level;
		this.experience=experience;
	}
	
	void printinfo() {
		System.out.println("이름 : "+ name + ", 레벨 : " + level + ", 경험치 : "+experience);
	}
	
	void attack() {
		System.out.println(name + "이(가) 공격을 시전합니다!");
	}
	
	void avoid() {
		System.out.println(name + "이(가) 도망칩니다!");
	}
	
	void win() {
		int a=(int)(Math.random()*100)+1;
		experience=experience+a;
		
		if(experience>=100) {
			level++;
			experience=experience-100;
			System.out.println(name + "이(가) 경험치를 "+ a +" 획득했고 레벨이 "+ level + "이(가) 되었습니다!");
			}
		
		
		else {
			System.out.println(name + "이(가) 경험치를 "+ a +" 획득했습니다!");
			}
	
	}
}	
