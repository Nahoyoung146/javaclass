
public class Main {
	public static void main(String[] args) {
		
		A5.a();
		B5.a();
		
		B5 b5 = new B5();
		b5.b();
		
		B6 b6 = new B6();
		b6.b();
	}

}

interface A5 {
	static void a() {
		System.out.println("A5 인터페이스의 스테틱 메소드");
	}
}

class B5 implements A5 {
	static void a() {
		System.out.println("B5 인터페이스의 스테틱 메소드");
	}
	
	public void b() {
		System.out.println("B5 인터페이스의 디폴트 메소드");
	}
}

class B6 extends B5 {
	static void a() {
		System.out.println("B6 인터페이스의 스테틱 메소드");
	}
	
	public void b() {
		System.out.println("B5 인터페이스의 디폴트 메소드");
	}
}

// Static 메서드 : 메서드를 static으로 선언 → 클래스에 속하는 메서드

// 객체를 만들지 않아도 클래스 이름을 통해 호출할 수 있다.
// 인스턴스 변수나 메서드에 접근할 수 없다. (this 포인터가 존재하지 않기 때문)(static 끼리는 접근가능)

// static 메서드는 오버라이딩 할 수 없다.
// 정적 메서드(Static method)는 정적 바인딩(Static binding)에 의해 처리된다.
// 오버라이딩이 아닌 메서드가 숨겨지기 떄문에 static 메소드는 컴파일 시점에서 선언된 타일에 의해 메서드를 호출한다.