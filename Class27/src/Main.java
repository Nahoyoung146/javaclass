
public class Main {
	public static void main(String[] args) {

		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.b();

		Outer1 outer1 = new Outer1();
		System.out.println(outer1.a + " " + outer1.b);
		outer1.a();

		Outer1.Inner1 inner1 = outer1.new Inner1();
		System.out.println(inner1.a + " " + inner1.b);
		inner1.a();
		inner1.b();
	}
}

class Outer {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;

	void a() {
		System.out.println("외부 클래스의 a 메서드");
	}

	class Inner {
		void b() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);

			a();
		}
	}
}

class Outer1 {
	int a = 3;
	int b = 4;

	void a() {
		System.out.println("외부 클래스의 a 메서드");
	}

	class Inner1 {
		int a = 5;
		int b = 6;

		void a() {
			System.out.println("내부 클래스의 a 메서드");
		}

		void b() {
			System.out.println(a);
			System.out.println(b);
			a();

			// 그렇다면 외부 클래스는?
			// this.a, Outer.a
			System.out.println(Outer1.this.a);
			System.out.println(Outer1.this.b);
			Outer1.this.a();
		}
	}
}

// 내부 클래스(inner class) - 클래스 내부에 정의된 클래스
// 외부 클래스(Outer class) - 내부 클래스를 포함하고 있는 클래스

// 내부 클래스는 외부 클래스의 멤버로 간주된다. → 외부클래스 멤버에 쉽게 접근할 수 있다.

//class Outer{ // 외부 클래스
//		...
//		class Inner{
//		...}

// 장점
// 1. 코드의 모듈화 : 가독성과 유지보수성을 높일 수 있다.
// 2. 캡슐화 : 내부 클래스는 외부 클래스의 멤버를 쉽게 접근할 수 있다.
//			 이를 통해 외부 클래스의 구현을 캡슐화해서 내부 동작을 숨길 수 있다. (private 멤버에도 접근 가능)

// 단점
// 1. 메모리 사용량 : 비정적 내부 클래스는 외부 클래스의 인스턴스를 참조하므로 내부 클래스의 메모리를 사용한다.
// 2. 코드의 복합성
// 3. 클래스 결합도 : 내부 클래스와 외부 클래스는 강하게 결합되어 있다.
//				  → 외부 클래스의 변경이 내부 클래스에도 영향을 미칠 수 있다.

// 1.정적 내부클래스(static inner class)
// 외부 클래스와 독립적이다.
// 외부 클래스의 인스턴스를 생성하지 않고, 내부 클래스를 생성할 수 있다.
// 외부 클래스의 정적 멤버에만 접근할 수 있다.
// 일반적으로 외부 클래스와 밀접한 관련이 있는 독립적인 클래스를 구현하기 위해 사용한다.

// 2. 비정적 내부클래스 (Non-static inner class)
// 외부 클래스의 인스턴스에 종속적이다.
// 외부 클래스의 객체를 생성해야만 내부클래스를 생성할 수 있다.
// 외부 클래스의 모든 멤버에 접근할 수 있고, 외부 클래스의 특정 기능을 구현하기 위해서 일반적으로 사용된다.