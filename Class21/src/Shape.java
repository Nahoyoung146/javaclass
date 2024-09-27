
public abstract class Shape {
	private String color;

	Shape(String color) {
		this.color = color;
	}

	String getColor() {
		return color;
	}

	abstract void area();

	abstract void color();

}
