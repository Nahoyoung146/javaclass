
public class class1 {
	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		int i=1;
		char c='a';
		double f=12.13;
		boolean b=true;
		String str="hello";
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(f);
		System.out.println(b);
		System.out.println(str);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		int numberofBasket, eggsPerBasket, totalEggs;
		
		numberofBasket=10;
		eggsPerBasket=5;
		 
		totalEggs=numberofBasket*eggsPerBasket;
		
		System.out.print("If you have ");
		System.out.print(eggsPerBasket +"eggs Per Basket and");
		System.out.println(numberofBasket +  "basket,then the total number of eggs is" + totalEggs);
		
		//Sting에서는?
		//string + 연산자 → 문자열 합치기 → 문자열이 가장 상위 등급 → 다른 자료형 문자열이 자동 형변환
		System.out.println("hello"+"world");
		System.out.println("String"+1+2+3);
		System.out.println(1+2+3+"String");
		System.out.println(1+2+3+"String"+1+2+3+"String"+1+2+3);
		
//		char c='c';
		System.out.println('c'+1);
		System.out.println(c+1);
		
//		//증감연산자
//		c+=1;
//		System.out.println(c);
		
		String eggs="eggs per basket and";
		String n="JAVA";
		
		System.out.println(eggs);
		System.out.println(n+eggs);
		
		//method
		System.out.println(eggs.charAt(3));
		
		System.out.println(n.concat(eggs));

		System.out.println("Hello world");
			
//			int i=1;
//			char c='a';
//			double f=12.13;
//			boolean b=true;
//			String str="hello";
			
			System.out.println(i);
			System.out.println(c);
			System.out.println(f);
			System.out.println(b);
			System.out.println(str);
	}
}