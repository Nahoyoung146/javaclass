package Person;

public class Student extends Person{
	
	private int grade;
	
	Student(){
		this.grade=0;
	}
	
	Student(String name, int grade){
		super(name);
		this.grade=grade;
	}
	
	void study() {
		grade++;
		System.out.println(getName() + "의 성적은 " + grade + "점입니다.");
	}
}