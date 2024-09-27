import java.util.Scanner;

public class class4 {
	public static void main(String[] args) {
		int score;
		char grade;
		int year;
		
		System.out.println("Enter your score : ");
		Scanner sc = new Scanner(System.in);
		score=sc.nextInt();
		
		//조건문
		//1. if문
		if (score >= 90)
			grade='A';
		else if (score >= 80)
			grade='B';
		else if (score >= 70)
			grade='C';
		else if (score >= 60)
			grade='D';
		else
			grade='F';
		
		System.out.println("score = " + score + ", Grade = " + grade);
		
		//2. switch문 (break 필수)
		System.out.println("Enter your year : ");
		Scanner keyboard = new Scanner(System.in);
		year=keyboard.nextInt();
		
		switch(year) {
		case 1 :
			System.out.println("freshman");
			break;
		case 2 :
			System.out.println("sophomore");
			break;
		case 3 :
			System.out.println("junior");
			break;
		case 4 :
			System.out.println("senior");
			break;
		case 5 :
			System.out.println("super senior");
			break;
		default :
			System.out.println("huh?");
		}
	}
}