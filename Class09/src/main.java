
public class main {
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.name="BMW";
		car1.speed=100;
		
		car2.name="현대";
		car2.speed=90;
		
		System.out.println(car1.name+car1.speed);
		System.out.println(car2.name+car2.speed);
		car1.runCar();
		car2.runCar();
		car1.breakCar();
		car2.breakCar();
	
		Person person1=new Person("철수",20);
		Person person2=new Person("영희");
		Person person3=new Person();
		person1.name="철수";
		person1.age=25;
		person2.name="영희";
		person2.age=30;
		
		person1.speakPerson();
		person1.runPerson();
		person1.eatPerson();
		person2.speakPerson();
		person2.runPerson();
		person2.eatPerson();
		
		person3.speakPerson();
		person3.runPerson();
		person3.eatPerson();
	}
}

//클래스와 객체
//클래스 → 파일
//클래스 → 설계도
//객체 → 설계도를 이용하여 만든 것

//변수(단수)- 엔진, 핸들, 브레이크, 계기판 .....
//리스트- 바퀴, 창문, 의자, 문 ....
//함수(동작)- 시동, 멈추고, 에어컨, 창문을 내린다....

//모두 포함한 것이 클래스다.
//자동차- 설계도
//자동차1, 자동차2, 자동차3....- 객체

//class Car{
// int engine;
// int handle;
// int[] wheel;
// int[] window;
// void break(){};
// void excell(){};

//생성자
//생성할 때, 객체한테 값을 전달해주는 것 → 초기화 작업을 편리하게 돕는 것 (객체가 만들어질 때, 첨부파일 전달)