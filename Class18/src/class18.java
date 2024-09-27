
public class class18 {
	public static void main(String[] args) {
		System.out.println(Counter.count);
		Counter count1 = new Counter();
		Counter count2 = new Counter();
		System.out.println(count1.count);
		System.out.println(count2.count);
		Counter.countup();
		Counter.countup();
		System.out.println(Counter.count);
		System.out.println(Counter.count);
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);
	}
}

class Counter{
	static int count = 0;
	
	Counter(){
		count++;
	}
	
	static void countup() {
		count++;
	}
}

class Singleton {
	private static int count = 0;
	private static Singleton singleton;
	
	private Singleton() {
		count++;
	}
	
	public static Singleton getInstance() {
		if(count==0) {
			singleton = new Singleton();
		}
		return singleton;
	}
}

//정적 static
//메모리 직접 저장 <위치 공유>

//정적멤버
//static 변수 (정적 필드)
//static 메소드 (정적 메소드)

//클래스의 로딩이 끝나는 즉시 사용 가능하며, 모든 객체가 메모리를 공유
//모든 객체가 공유하기 때문에 하나의 멤버를 어디서든 볼 수 있다.
//프로그램 종료시까지 메모리가 할당된 채로 존재한다. static을 남발하면 시스템 성능 저하.