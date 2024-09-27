
public class mainmovie {
	public static void main(String[] args) {
		Movie movie= new Movie();
		Action action= new Action();
		Romance romance= new Romance();
		Horror horror= new Horror();
		
		movie.title();
		action.title();
		romance.title();
		horror.title();
	}
}

//오버로딩(Overloading)
//생성자 뿐만 아니라 같은 이름의 메서드를 여러 개 선언하는 것.
//자료형이나 매개변수를 다르게 하여 같은 이름의 메서드도 서로 구별이 되어야 함.

//오버라이딩(Overriding)
//부모 클래스의 메서드를 자식 클래스에서 재정의하는 것.
//부모 클래스의 동작을 자기 동작으로 바꾼다.

//굳이 부모 클래스를 수정하지 않고, 자식 클래스에서 메서드 기능을 변경하기 위해 사용한다.

//주석 → 컴퓨터가 읽지 못하는 메모
//컴퓨터가 읽을 수 있는 메모 → @Override

//오버라이딩할 메서드는 접근지정자(public), 반환 자료형, 이름, 매개변수 개수와 순서, 자료형 등이 부모 메서드와 일치해야 한다.