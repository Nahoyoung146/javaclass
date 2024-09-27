package Animal;

public class Class22 {

}

// 추상 클래스 : 추상 메서드를 포함한 클래스 (객체화X)

//Animal (동물) - Eat()

//Bird (새) - wings

//Eagle(독수리) : wings, Fly()
//Penguin(펭귄) : wings, Swim()
//Duck(오리) : wings, Fly(), Swim()
//Parrot(앵무새) : wings, Fly()

//Fish - gill

//dolphin(돌고래) : gill, Swim()
//Whale(고래) : gill,  Swim()
//Flyfish(날치) : gill, Swim(), Fly()
//Cutlassfish(갈치) : gill, Swim()

//인터페이스(intergace) : 다중상속을 지원 (자식 클래스가 여러 부모클래스를 상속받게 하는 것)
//인터페이스 → 추상메서드와 상수 → 인스턴스화(객체화) 불가능

// 접근제어자 interface 인터페이스 이름 {
//  public static final 타입 변수명 = 값;
//  public abstract 메소드 이름(매개변수들);

// public static final, public abstract 생략되면 컴파일러가 자동으로 추가해준다.

// extends 키워드 : 부모 하나
// implements 키워드 : 인터페이스 상속, 컴마(,)키워드를 사용하여 여러개를 입력해줄 수 있다.
// public class Flyfish extends Fish implements Swim(), Fly()