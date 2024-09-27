
public class Bird extends Animal{
	String sing;
	
	Bird(String name, int age, String sing){
		super(name, age);
		this.sing=sing;
	}
	
	void sleep() {
		System.out.println("새는 노래하는 걸 좋아해.");
	}
	
	void eat() {
		System.out.println(super.retName() + "가(이) 사료를 먹는다.");
	}
	
	void sing() {
		System.out.println(name + "는(은) " + sing + "를(을) 잘합니다.");
	}
}