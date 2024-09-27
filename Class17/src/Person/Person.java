package Person;

public class Person {
	private String name;
	private int age;

	String getName() {
		return name;
	}
	
	Person(){
		this.name = "알 수 없음";
		this.age= 0;
	}
	
	Person(String name){
		this.name = name;
		this.age=0;
	}
	
	Person(String name, int age){
		this.name = name;
		this.age= age;
	}
}