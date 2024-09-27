
public class class2 {
public static void main(String[] args) {
	//문자열 메소드 String method
	
	String greeting = "Hello";
	String sentence =greeting+" professor";
	System.out.println(sentence);
	
	//length() → 문자열의 길이를 변환
	System.out.println(greeting.length());
	System.out.println(sentence.length());
	
	//toLowerCase() → 모든 문자를 소문자로 변환
	System.out.println(greeting.toLowerCase());
	System.out.println(sentence.toLowerCase());
	
	//toUpperCase() → 모든 문자를 대문자로 변환
	System.out.println(greeting.toUpperCase());
	System.out.println(sentence.toUpperCase());
		
	//replace()	→ 특정 문자를 원하는 문자로 변환
	System.out.println(greeting.replace('l','z'));
	System.out.println(sentence.replace('o','b'));
	
	//substring() → 문자열 자르기
	System.out.println(sentence.substring(6));
	System.out.println(greeting.substring(0,3)); //substring(a,b)→ a부터 b전까지
	
	//charAt() → n번째 문자 출력
	System.out.println(greeting.charAt(1));
	System.out.println(sentence.charAt(10));
	
	//indexOf() → 특정 문자의 가장 앞선 위치를 반환
	System.out.println(greeting.indexOf('l'));
	System.out.println(sentence.indexOf(' '));
	System.out.println(greeting.indexOf('z'));
	
	//lastIndexOf() → 가장 뒤에 있는 위치를 반환
	System.out.println(greeting.lastIndexOf('l'));
	System.out.println(sentence.lastIndexOf('o'));
	
	//concat() → 문자열 합치기
	System.out.println(greeting.concat(sentence));
	System.out.println(greeting.concat(" professor"));

	//equals() → 문자열 같은지 확인
	System.out.println(greeting.equals("Hello"));
	System.out.println(greeting.equals("hello"));
	
	//equalsIgnoreCase → 대소문자 구별없이 같은지
	System.out.println(greeting.equalsIgnoreCase("hello"));
	System.out.println(greeting.toUpperCase().equals("hello".toUpperCase()));
	
	//compareTo → 문자열 비교
	System.out.println(greeting.compareTo("Aello"));
	System.out.println(greeting.compareTo("Hello"));
	System.out.println(greeting.compareTo("Zello"));
	System.out.println(greeting.compareTo("Hellp"));
	System.out.println(greeting.compareTo("hello"));
	
	System.out.println(greeting.substring(0,greeting.length()-1));
	
	greeting=greeting.substring(1);
	sentence=sentence.concat(greeting);
	System.out.println(greeting);
	System.out.println(sentence);
	}
}