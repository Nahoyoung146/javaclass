
public class store extends building{
	String small;
	String item;
	String item2;
	String item3;
	int satisfaction;
	
	store(){
		this.item = "운동화";
		this.item2="청바지";
		this.item3="삼겹살";
		this.satisfaction=10;
		this.small = "작습니다.";
	}
	
	store(String item){
		this.item=item;
		this.item2="청바지";
		this.item3="삼겹살";
		this.satisfaction=10;
		this.small = "작습니다.";
	}
	
	store(String item,int satisfaction){
		this.item=item;
		this.item2="청바지";
		this.item3="삼겹살";
		this.satisfaction=satisfaction;
		this.small = "작습니다.";
	}
	
	store(String tradename, int floor, String small){
		super(tradename, floor);
		this.item = "운동화";
		this.item2="청바지";
		this.item3="삼겹살";
		this.small=small;
	}
	
	store(String tradename, int floor, String item, String item2, String item3, String small){
		super(tradename, floor);
		this.item = item;
		this.item2= item2;
		this.item3= item3;
		this.small=small;
	}
 
	void introduce() {
		System.out.println("상점은 옷가게, 신발가게, 식료품점이 있으며 각 상점들의 대표 품목은 " + this.item + ", " + this.item2 + ", "+ this.item3 + "입니다.");
	}

	void location() {
		System.out.println("옷가게의 이름은 "+ tradename +"이고 가게의 층은 " + floor +"입니다.");
	}
	
	void small() {
		System.out.println("이 상점들의 규모는 다 " + small);
	}	
}