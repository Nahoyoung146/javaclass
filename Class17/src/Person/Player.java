package Person;

public class Player extends Person{
	private String name;
	private int dice;
	private String winner;
	
	Player(){
		this.name="알 수 없음";
		this.dice=6;
	}
	
	Player(String name){
		this.name=name;
		this.dice=6;
	}
	
	int rolldice() {
		int dice=(int)(Math.random()*6)+1;
		return dice;
	}
	
	void play(Player player) {
		this.dice=rolldice();
		player.dice=rolldice();
		
		if(this.dice > player.dice) {
			winner=this.name;
			System.out.println("승자는 " + winner + "입니다.");
		}
		
		else if(player.dice > this.dice) {
			winner=player.name;
			System.out.println("승자는 " + winner + "입니다.");
		}
		
		else {
			System.out.println("무승부입니다. 경기를 다시 시작해 주세요.");
		}
	}
	
	void play(Person person) {
		if(person instanceof Student) {
			System.out.println(person.getName() + "야, 공부하렴");
		}
		
		else if(person instanceof Player) {
			Player player = (Player) person;
			this.dice=rolldice();
			player.dice=rolldice();
			
			if(this.dice > player.dice) {
				winner=this.name;
				System.out.println("승자는 " + winner + "입니다.");
			}
			
			else if(player.dice > this.dice) {
				winner=player.name;
				System.out.println("승자는 " + winner + "입니다.");
			}
			
			else {
				System.out.println("무승부입니다. 경기를 다시 시작해 주세요.");
			}
		}
	}
}

//변수끼리 캐스팅  -> 자료형 변경
//객체끼리 캐스팅 (단, 부모자식 관계에서만 가능하다.)
//업캐스팅, 다운캐스팅
//업캐스팅 : 자식클래스가 부모클래스 타입으로 캐스팅 되는 것.
//Car car = new Car();
//Bus bus = new Bus();

//Car car2 = (Car)bus; -> 저 버스는 차다.
//Bus bus2 = (Bus)car; -> 저 차는 버스다. X

//Car car = (Car) new Bus(); 묵시적 형변환이 일어난다.
//(bus)car.pay(); -> 부모객체에서 자식타입의 객체를 참조할 때 명시적으로 형변환을 해주어야한다.

//객체에서 모든 부모클래스는 자식클래스를 참조해서 사용하는 것이 가능하다. 

//Taxi taxi = new Taxi();
//Car car = (Car) taxi;
//Taxi taxi = (Taxi) car; X

//다운캐스팅 : 업캐스팅한 객체를 되돌린다.
//Bus bus2 = (Bus)car;
//Car car2 = (Car)bus;

//Bus bus;
//bus = (Bus) car2;