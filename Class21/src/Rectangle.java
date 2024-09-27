
public class Rectangle extends Shape {
	private int base;
	private int height;

	Rectangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	void area() {
		int area = base * height;
		System.out.println("이 도형의 넓이는 " + area + "입니다.");
	}

	void color() {
		System.out.println("이 도형의 색깔은 " + getColor() + "입니다.");
	}
}
