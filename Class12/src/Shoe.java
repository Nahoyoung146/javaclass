
public class Shoe extends store {
	String various;
	
	Shoe(String item, int satisfaction, String various){
			super(item, satisfaction);
			this.various=various;
	}
	
//	Shoe(String item, int satisfaction, String various, String small){
//		super(item, satisfaction, small);
//		this.various=various;
//	}

	void come() {
			System.out.println("고객들이 신발가게로 들어옵니다.");
		}
		
	void recommend() {
			System.out.println("이 가게의 대표 품목은 " + item +"입니다.");
		}
		
	void various() {
			System.out.println("이 곳의 신발들이 아주 " + various);
		}
}