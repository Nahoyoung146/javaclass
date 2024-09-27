package 숙제;

public class RTS extends Game{
	private String species;
	
	String getSpecies() {
		return species;
	}
	
	RTS(String name, int age, String species){
		super(name, age);
		this.species = species;
	}
}