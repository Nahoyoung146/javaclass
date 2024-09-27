
public class Chinese extends restaurant {
	 String salty;
	
	 Chinese(String menu, String price, String salty){
			super(menu, price);
			this.salty=salty;
		}
	 
	 void visit() {
			System.out.println("손님들이 중식당으로 방문합니다.");
		}
		
	void information() {
			System.out.println("이 식당의 대표 메뉴는(은) " + menu +"입니다.");
		}
		
	void salty() {
			System.out.println("음식의 맛은 " + salty);
		}
}