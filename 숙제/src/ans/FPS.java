package ans;

public class FPS extends Game{
	private int rank;
	private String str;
	
	int getRank() {
		return rank;
	}
	
	FPS(String name, int age, int rank, String str){
		super(name, age);
		this.rank=rank;
		this.str = str;
	}
	
	void hint() {
		System.out.println("게임 출시된 지 " + super.getAge() + "년 되었고 " + "이 게임의 순위는 " + getRank() + "입니다.");
	}

	void quiz() {
		System.out.println("글자수 : " + getName().length());
		System.out.println("이 게임의 중요 요소 : " + this.str);
	}
}