
public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle("빨간색", 7, 5);
		Circle circle = new Circle("파란색", 8);

		rectangle.color();
		rectangle.area();

		circle.color();
		circle.area();

	}

}

// 숙제 : ArrayList에 단어들을 여러개 추가해보고, 단어 검색하는 프로그램