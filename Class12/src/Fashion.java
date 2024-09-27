
public class Fashion extends store {
	 String nice;
		
	 Fashion(String item, int satisfaction, String nice){
			super(item, satisfaction);
			this.nice=nice;
		}
	 
	 void come() {
			System.out.println("고객들이 옷가게로 들어옵니다.");
		}
		
	void recommend() {
			System.out.println("이 가게의 대표 품목은 " + item +"입니다.");
		}
		
	void nice() {
			System.out.println("이 곳의 옷들이 아주 " + nice);
		}
}