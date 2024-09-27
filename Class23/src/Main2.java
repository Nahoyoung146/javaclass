
public class Main2 {

	public static void main(String[] args) {
		System.out.println("인터페이스의 객체화");

		B b = new B();
		b.a(); // a 클래스는 static 메서드가 아니기 때문에 객체를 생성하지 않으면 쓸 수 없다.

		A b1 = new B();
		A b2 = new B();

		b1.a();
		b2.a();

		A a = new A() {
			public void a() {
				System.out.println("익명이너클래스를 사용하여 a메서드를 정의하였다.");
			}

			public void b() { // 새롭게 메서드를 정의하는 것은 불가능하다.
				System.out.println("익명이너클래스를 사용하여 a메서드를 정의하였다.");
			}
		};

		a.a();
//		a.b();
	}

}

interface A {
	int a = 3;

	void a();
}

class B implements A {
	public void a() {
		System.out.println("클래스 B가 인터페이스의 a 메서드를 정의하였다.");
	}
}