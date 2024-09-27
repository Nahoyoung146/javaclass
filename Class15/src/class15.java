
public class class15 {
	public static void main(String[] args) {
		System.out.println(Counter.count);
		
		Counter counter1 = new Counter();
		
		System.out.println(counter1.count);// 1.1
		
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();
		
		System.out.println(counter1.count);// 2.3
		System.out.println(counter2.count);// 3.3
		System.out.println(counter3.count);// 4.3
		System.out.println(Counter.count);// 5.3
		
		//증가하는 부분 : 6, 10, 11
		
		int res = MathUtils.sum(5, 3);
		System.out.println("결과는 : " + res);
		
		Math.random();
		System.out.println(Math.ceil(2.5));
		System.out.println(Math.floor(2.5));
		
		printCount();
	}
	
	static void printCount() {
		System.out.println("Static은 공유됩니다.");
	}
}

class Counter {
	static int count=0;
	
	Counter() {
		count++;
	}
}

class MathUtils {
	static int sum(int a, int b) {
		return a+b;
	}
}

//정적 static
//메모리 직접 저장 <위치 공유>
//클래스 수준에서 공유된다.
//Monster mon = new Monster();
//mon.변수, mon.메서드();

//static으로 만들어진 변수나 메서드는 굳이 객체를 만들지 않아도 된다.
//Monster.변수, Monster.메서드()
//인스턴스(객체), 생성없이 직접 클래스의 이름을 통해서 접근할 수 있다.
//속성(인스턴스 변수), 행동(메서드)

//정적변수
//공통된 동작