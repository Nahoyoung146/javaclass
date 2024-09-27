
public class Korea extends restaurant {
	 String spicy;
	
	 Korea(String menu, String price, String spicy){
			super(menu, price);
			this.spicy=spicy;
	 	}
	 
	 Korea(String menu, String price, String spicy, String big){
		 	super(menu, price, big);
			this.spicy=spicy;
		}
	 
	 void visit() {
			System.out.println("손님들이 한식당으로 방문합니다.");
			super.expensive();
		}
		
	void information() {
			System.out.println("이 식당의 대표 메뉴는(은) " + menu +"입니다.");
		}
		
	void spicy() {
			System.out.println("음식의 맛은 " + spicy);
		}
}