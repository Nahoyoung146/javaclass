
public class Main {

	public static void main(String[] args) {
		
		A2 c1 = new C1();
		A2 c2 = new C2();
		A2 c3 = new C3();
		
		c1.a();
		
		c2.a();
		c2.b();
		
		c3.a();
		c3.b();
		
	}

}

// 인터페이스 → 추상메소드, 상수
// JAVA 8 → 디폴트 메소드, 스테틱 메소드

// 디폴트 메소드 : 인터페이스에서 정의된 메소드
// 객체지향 설계 원칙 중 개방 폐쇄 원칙 (OCP) : 확정에는 OPEN, 변경에는 CLOSE

interface A2 {
	public abstract void a();
	default void b() {
		System.out.println("A2 인터페이스의 디폴트 메소드");
	}
}

class C1 implements A2{
	public void a() {
		System.out.println("A2 인터페이스의 추상 메소드, 나는 C1");
	}
}

class C2 implements A2 {
	public void a() {
		System.out.println("A2 인터페이스의 추상 메소드, 나는 C2");
	}
	
	public void b() { // 디폴트 메소드를 오버라이딩할때는 public으로 바꾸어서 재정의해야한다.(컴파일러)
		System.out.println("C2에서 재정의한 디폴트 메소드");
	}
}

class C3 implements A2 {
	public void a() {
		System.out.println("A2 인터페이스의 추상 메소드, 나는 C3");
	}
	
	public void b() { // 디폴트 메소드를 오버라이딩할때는 public으로 바꾸어서 재정의해야한다.(컴파일러)
		A2.super.b(); // 부모클래스, 여러 개의 인터페이스 중 어떤 부모를 가르키는지 모른다. 따라서 인터페이스는 명시한다.
		System.out.println("C3에서 재정의한 디폴트 메소드");
	}
}