
public class main {
	public static void main(String[] args) {
		Dog dog = new Dog("푸들", 3, "수영");
		
		dog.sleep();
		dog.walk();
		dog.eat();
		dog.play();
		
		System.out.println();
		
		Cat cat = new Cat("페르시안", 1, "높이뛰기");
		
		cat.sleep();
		cat.eat();
		cat.jump();
		
		System.out.println();
		
		Bird bird = new Bird("앵무새", 2, "노래");
		
		bird.sleep();
		bird.eat();
		bird.sing();
	}
}

//상속 → 클래스간의 관계(상하)
//내가 가지고 있는 속성(인스턴스 변수), 행동(메소드)가 다른 클래스에도 이미 있다면?
//혹은 여러 클래스를 만드는 데, 겹치는 속성과 행동이 많다면?
//똑같이 생긴 설계도를 또 계속 만들어야하네??
//다른 설계도를 베껴올 수 있었으면 좋겠다.

//부모 클래스 (이미 만들어져 있는 섫계도)
//자식 클래스 (베껴서 새로 작성할 설계도)