
public class Cat extends Animal {
	String jump;
	
	Cat(String name, int age, String jump){
		super(name, age);
		this.jump=jump;
	}
	
	void sleep() {
		System.out.println("고양이는 뛰는 걸 좋아해.");
	}
	
	void eat() {
		System.out.println(super.retName() + "이(가) 사료를 먹는다.");
	}
	
	void jump() {
		System.out.println(name + "는(은) " + jump + "을(를) 잘합니다.");
	}
}