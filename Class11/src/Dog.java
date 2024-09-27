
public class Dog extends Animal {
	String play;
	
	Dog(String name, int age, String play){
		super(name, age);
		this.play=play;
	}
	
	void sleep() {
		super.sleep();
		System.out.println("강아지는 잠을 자는 걸 좋아해.");
	}
	
	void walk() {
		System.out.println(name + "이(가) 산책을 좋아합니다.");
	}
	
	void eat() {
		System.out.println(super.retName() + "이(가) 밥을 먹는다.");
	}
	
	void play() {
		System.out.println("취미는 " + play + "입니다.");
	}
}
