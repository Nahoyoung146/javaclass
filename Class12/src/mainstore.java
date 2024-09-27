
public class mainstore {
	public static void main(String[] args) {
		Fashion fashion=new Fashion("청바지", 50, "멋집니다.");
		
		fashion.come();
		fashion.recommend();
		fashion.nice();
		
		System.out.println();
		
		Shoe shoe = new Shoe("운동화", 70, "다양합니다.");
		
		shoe.come();
		shoe.recommend();
		shoe.various();
		shoe.introduce();
		shoe.location();
		shoe.small();
	
		System.out.println();
		
		Food food = new Food("삼겹살", 100, "맛있습니다.");
		
		food.come();
		food.recommend();
		food.tasty();
	}
}