package Person;

public class Person {
	private String name;
	
	String getName() {
		return name;
	}
	
	Person(){
		this.name = "알 수 없음";
	}
	
	Person(String name){
		this.name = name;
	}
}