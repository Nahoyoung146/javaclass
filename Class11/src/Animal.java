
public class Animal {
	String name;
	int age;
	
	Animal(){
		
	}
	
	Animal(String name){
		this.name=name;
		this.age=1;
	}
	
	Animal(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void eat() {
		System.out.println("먹는다.");
	}
	
	void sleep() {
		System.out.println("잔다.");
	}
	
	void walk() {
		System.out.println("걷는다.");
	}
	
	void play() {
		System.out.println("논다.");
	}
	
	String retName() {
		return name;
	}
}