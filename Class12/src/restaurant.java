
public class restaurant extends building {
	String big;
	String menu;
	String menu2;
	String menu3;
	String price;
	
	
	restaurant(){
		this.menu = "육개장";
		this.menu2= "초밥";
		this.menu3= "훠궈";
		this.price= "8000원";
		this.big = "큽니다.";
	}
	
	restaurant(String menu){
		this.menu = menu;
		this.menu2= "초밥";
		this.menu3= "훠궈";
		this.price= "8000원";
		this.big = "큽니다.";
	}
	
	restaurant(String menu, String price){
		this.menu = menu;
		this.menu2= "초밥";
		this.menu3= "훠궈";
		this.price=price;
		this.big = "큽니다.";
		this.tradename= "홍콩반점";
		this.floor= 7;
	}
	
	restaurant(String menu, String price, String big){
		this.menu = menu;
		this.menu2= "초밥";
		this.menu3= "훠궈";
		this.price= price;
		this.big = big;
	}
	
	restaurant(String tradename, int floor, String big){
		super(tradename, floor);
		this.menu= "육개장";
		this.menu2= "초밥";
		this.menu3= "훠궈";
		this.big = big;
	}
	
	restaurant(String tradename, int floor, String menu, String menu2, String menu3, String big){
		super(tradename, floor);
		this.menu= "육개장";
		this.menu2= "초밥";
		this.menu3= "훠궈";
		this.big = big;
	}
	
	void introduce() {
		System.out.println("음식점은 한식당, 일식당, 중식당이 있으며 각 음식점의 대표 메뉴는 " + this.menu + ", " + this.menu2 + ", "+ this.menu3 + "입니다.");
	}

	void location() {
		System.out.println("중식당의 이름은 "+ tradename +"이고 가게의 층은 " + floor +"입니다.");
	}
	
	void big() {
		System.out.println("이 음식점들의 규모는 다 " + big);
	}

	void expensive() {
		System.out.println(menu + "이(가) 너무 비쌉니다.");
	}
}