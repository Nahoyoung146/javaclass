package ans;

public class RTS extends Game{
	private String species;
	private String str;
	
	String getSpecies() {
		return species;
	}
	
	RTS(String name, int age, String species, String str){
		super(name, age);
		this.species = species;
		this.str = str;
	}
	
	void hint() {
		System.out.println("게임 출시된 지 " + super.getAge() + "년 되었고 " + "이 게임의 종족은 " + getSpecies() + "가(이) 있습니다.");
	}

	void quiz() {
		System.out.println("글자수 : " + getName().length());
		System.out.println("이 게임의 유명한 선수 : " + this.str);
	}
}