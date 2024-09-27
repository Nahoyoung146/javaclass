
public class mainrestaurant {
	public static void main(String[] args) {
		Korea korea=new Korea("육개장", "8000원", "맵습니다.");
		
		korea.visit();
		korea.information();
		korea.spicy();
		korea.introduce();
		korea.location();
		korea.big();
		
		System.out.println();
		
		Japanese japanese = new Japanese("초밥", "50엔", "싱겁습니다.");
		
		japanese.visit();
		japanese.information();
		japanese.bland();
		
		System.out.println();
		
		Chinese chinese = new Chinese("훠궈", "100위안", "짭니다.");
		
		chinese.visit();
		chinese.information();
		chinese.salty();
	}
}