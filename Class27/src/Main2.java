
public class Main2 {
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.a();

		Aclass a = new Aclass();
		Inter i = new Inter() {
			public void a() {
				System.out.println("매개변수 전달");
			}
		};

		i.a();
		a.b(i);

		a.b(new Inter() {
			public void a() {
				System.out.println("매개변수 전달");
			}
		});

		A a0 = new A();
		a0.func();

		A1 a1 = new A1();
		a1.a();

		A2.B1 a2 = new A3();
		A3 a3 = new A3();

		a2.b();
		a3.b();

		A2.B1 a4 = new A2.B1() {
			@Override
			public void b() {
				System.out.println("익명내부클래스로 객체 생성");
			}
		};
		a4.b();
	}
}

class Outer2 {
	int a = 3;

	void a() {
		final int b = 4;

		class Inner2 {
			void b() {
				System.out.println(a); // 3
				System.out.println(b); // 4
				a = 5;
//				b=6; // 지역이너클래스에서 사용되는 지역변수는 자동으로 final
				System.out.println(a); // 5
				a = 1;
				System.out.println(a); // 1
			}
		}
		Inner2 inner = new Inner2();
		inner.b();

//			b=5;
		System.out.println(a); // 1
		System.out.println(b); // 4

		class A {
		}
		class B {
		}
	}
}

interface Inter {
	void a();
}

class Aclass {
	void b(Inter i) { // 인터페이스 객체 i는 추상 메서드의 선언을 완료해야 한다.
		i.a(); // 추상 메서드는 메서드 선언이 완료되지 않았기 때문에 사용할 수 없다. X
	}
}

class A {
	int a = 1;
	C c = new B();

	class B implements C {
		public void b() {
			System.out.println("인스턴스 이너클래스");
		}
	}

	B b = new B();

	void func() {
		c.b();
		b.b();
	}
}

interface C {
	void b();
}

class A1 {
	B b = new B() {
		public void b() {
			System.out.println("익명내부클래스");
		}
	};

	void a() {
		b.b();
	}
}

interface B {
	public abstract void b();
}

class A2 {
	interface B1 { // 내부 인터페이스
		public abstract void b();
	}
}

class A3 implements A2.B1 {
	public void b() {
		System.out.println("내부 인터페이스의 메서드 구현");
	}
}

// 3. 지역 내부클래스 (Local inner class)
// 메서드나 볼록 내부에 정의되는 이너클래스
// 메서드 내에서만 사용되며 해당 메서드 내에서만 유효하다.
// 주로 메서드 내부에서 임시적으로 사용되는 클래스를 정의할 때 사용한다.

// 4. 익명 내부클래스 (Anonymous inner class)
// 이름이 없는 클래스 → 주로 한번만 사용되는 간단한 클래스를 구현할 때 사용된다.
// 보통 인터페이스나 추상 클래스의 구현체로 사용된다.
// 클래스 정의와 함께 인스턴스를 생성하여 사용한다.

// 내부 인터페이스 (Inner Interface) : 하나의 클래스 안에 인터페이스를 선언하는 것.
// 외부 클래스의 특정 기능을 구현하기 위해 사용된다.
// 내부 인터페이스는 인터페이스의 모든 가능을 가지고, 외부 클래스의 멤버에 해당한다.

// 외부 클래스와 마찬가지로 접근지정자 설정이 가능하다.
// 내부 인터페이스는 멤버 변수와 메서드 또한 가질 수 있다.