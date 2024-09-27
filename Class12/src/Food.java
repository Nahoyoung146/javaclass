
public class Food extends store {
	 String tasty;
		
	 Food(String item, int satisfaction, String tasty){
			super(item, satisfaction);
			this.tasty=tasty;
		}
	 
	 void come() {
			System.out.println("고객들이 식료품점으로 들어옵니다.");
		}
		
	void recommend() {
			System.out.println("이 가게의 대표 품목은 " + item +"입니다.");
		}
		
	void tasty() {
			System.out.println("이 곳의 식품들이 아주 " + tasty);
		}
}