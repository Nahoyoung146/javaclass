package 숙제;

public class FPS extends Game{
	private int rank;
	
	int getRank() {
		return rank;
	}
	
	FPS(String name, int age, int rank){
		super(name, age);
		this.rank=rank;
	}
}