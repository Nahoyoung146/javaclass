
public class Person {
		String name;
		int age;
	
		//생성자
		Person() {//첨부파일이 없다 → 기본 생성자
			System.out.println("Person 객체를 생성합니다.");
			name = "알 수 없음";
			age = 19;
		}
		
		Person(String inputName) {
			name = inputName;
			age=20;
		}
		
		Person(int inputAge){
			age=inputAge;
		}
		
		Person(String inputName, int inputAge){
			name = inputName;
			age=inputAge;
		}
		
		void speakPerson(){
			System.out.println("저는 "+name+"이고 나이는 "+age+"입니다");
		}
	
		void runPerson(){
			System.out.println(name+"는 달리기 중입니다");
		}
	
		void eatPerson(){
			System.out.println(name+"는 음식을 먹고 있습니다");
		}
}