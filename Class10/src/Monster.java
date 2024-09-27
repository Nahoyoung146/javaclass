
public class Monster {
	String name;
	int health;
	
	Monster(String name,int health) {
		this.name=name;
		this.health=health;
	}
	
	void printinfo() {
		System.out.println("이름 : "+ name + ", 체력 : " + health);
	}
	
	void attack() {
		System.out.println(name + "이(가) 공격을 시전합니다!");
	}
}

//this 키워드
//현재 클래스에서 자기 자신이 가진 인스턴스 변수와 메서드를 가르킬 수 있도록 하는 키워드다.