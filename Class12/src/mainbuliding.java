
public class mainbuliding {
	public static void main(String[] args) {
		restaurant restaurant=new restaurant("마카오반점", 7, "육개장", "초밥", "훠궈", "큽니다.");
		
		restaurant.introduce();
		restaurant.location();
		restaurant.big();
		
		System.out.println();
		
		store store = new store("스무살의 청춘", 8, "청바지", "운동화", "삼겹살", "작습니다.");
		
		store.introduce();
		store.location();
		store.small();
	}
}