
public class Main {
	public static void main(String[] args) {
		Car car = new Car("BMW", 80);
		String str = "hello";

		String str2 = car + str;

		System.out.println(car);
		System.out.println(str);
		System.out.println(str2);

		System.out.println(str.equals("hello"));
		String str3 = "hello";
		System.out.println(str == "hello");
		System.out.println(str == str3);

		Car car2 = new Car("BMW", 100);
		System.out.println(car2);
		System.out.println(car == car2);
		System.out.println(car.equals(car2));
		System.out.println(str + ", " + str2 + 123 + car + car2);
	}
}

//최상위 클래스 Object
//모든 클래스가 상속받는 java.lang.Object

//toString() : 객체의 문자열을 생성하는 메소드
//equals(Object obj) : 두 객체의 동등성 여부를 판단해주는 메소드

//clone() : 객체의 복사본을 리턴하는 메소드
//finalize() : 객체가 메모리에서 해체될 때 실행되는 메소드
//getclass() : 클래스의 정보를 얻는 메소드
//wait() : 객체가 바뀔 때까지 기다리는 메소드
//wait(long timeout) : 객체가 변경될 때까지 timeout 만을 대기하는 메소드

//Object obj = new Car();
//return this.name == obj.name;
//Object 상에서 name이 있는지 알 수 없기 때문에

//명확하게 Object 어떤 클래스인지 검증하고 나면 사용할 수 있다.
//instanceof → boolean

//Parent p1, Child c1

//p1 instance of Child → p1 클래스가 Child야? flase
//p1 instance of Parent → p1 클래스가 Parent야? true
//p1 instance of Object → p1 클래스가 Object야? true

//c1 instance of Child → c1 클래스가 Child야? true
//c1 instance of Parent → c1 클래스가 Parent야? true
//c1 instance of Object → c1 클래스가 Object? true
