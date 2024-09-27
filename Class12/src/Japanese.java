
public class Japanese extends restaurant {
	 String bland;
	
	 Japanese(String menu, String price, String bland){
			super(menu, price);
			this.bland=bland;
		}
	 
	 void visit() {
			System.out.println("손님들이 일식당으로 방문합니다.");
		}
		
	void information() {
			System.out.println("이 식당의 대표 메뉴는(은) " + menu +"입니다.");
		}
		
	void bland() {
			System.out.println("음식의 맛은 " + bland);
		}
}