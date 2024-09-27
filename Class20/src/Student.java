public class Student {
	private String name;
	private int korea;
	private int english;
	private int math;
	private int stnumber;
	
	String getName(){
		return name;
	}
	
	int getStnumber(){
		return stnumber;
	}
	
	int getKorea(){
		return korea;
	}
	
	int getEnglish(){
		return english;
	}
	
	int getMath(){
		return math;
	}

	Student(String name, int korea, int english, int math, int stnumber) {
		this.name = name;
		this.korea = korea;
		this.english = english;
		this.math = math;
		this.stnumber = stnumber;
	}
	
	public String toString() {
		return "학번 : " + stnumber + ", 이름 : " + name + ", 국어 : " + korea + ", 영어 : " + english + ", 수학 : " + math;
	}
}