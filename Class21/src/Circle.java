
public class Circle extends Shape {

	private int radius;

	Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}

	void area() {
		double area = radius * radius * 3.14;
		System.out.println("이 도형의 넓이는 " + area + "입니다.");
	}

	void color() {
		System.out.println("이 도형의 색깔은 " + getColor() + "입니다.");
	}

}
