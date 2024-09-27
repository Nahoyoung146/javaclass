
public class class21 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.cry();
		dog.cry();
		cat.eat();
		dog.eat();

		System.out.println(dog);

//		Animal animal = new Animal(); 추상클래스는 단독으로 객체 생성 불가능
		Animal animal = new Cat(); // 다른 객체로 캐스팅하여 객체 생성 가능
		animal.cry();
		animal.eat();

		Animal animal2 = new Animal() {
			void cry() {
				System.out.println("동물 울음소리");
			}

			void eat() {
				System.out.println("동물 식사소리");
			}
		};

		animal2.cry();
		animal2.eat();
	}
}

abstract class Animal {
	abstract void cry();

	abstract void eat();

	@Override
	public String toString() {
		return "동물들을 활용한 추상 클래스 예제입니다.";
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹~");
	}

	@Override
	void eat() {
		System.out.println("츄르를 먹는다.");
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍멍~");
	}

	@Override
	void eat() {
		System.out.println("개껌을 먹는다.");
	}
}

// 추상 클래스 (Abstract class)
// 혼자 있으면 아무것도 할 수 없다. (객체 생성 불가능)
// 다른 클래스에 상속을 해주기 위한 용도로 사용된다.

// 추상 메서드 : 메서드의 시그니처 (이름, 매개변수, 반환타입)만 선언하고, 나머지는 자식 클래스에서 작성한다.
// 반드시 하나 이상의 추상 메서드를 가져야한다.

// abstract class 클래스이름 {
//		abstract 반환타입 메소드이름(매개변수);

// 추상 클래스를 상속받는 크래스는 반드시 추상 메서드를 재정의해줘야한다. (오버라이딩)

// 중복되는 부분이나 공통적인 부분 → 추상 메서드 → 자식 클래스에서 제대로 메서드를 만든다.

// 메서드 자체는 아무런 기능을 수행하지 않는다.
// 기능이 없으나, 메서드의 이름만 정의한다. (추상메서드) 기능을 정의하는 {} 메서드의 몸체를 생략

// 추상메서드를 하나도 포함하지 않아도 추상클래스로 정의는 가능하다.
// 단, 추상메서드가 없는 경우 추상클래스 정의할 이유가 없다.