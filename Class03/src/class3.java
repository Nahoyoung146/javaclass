import java.util.Scanner;

public class class3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter the whole number");
		System.out.println(" separated by one or more spaces :");
		
		int n1,n2;
		n1=scan.nextInt();
		n2=scan.nextInt();
		System.out.println("You entered "+n1+" and "+n2);
		
		System.out.println("Next enter two numbers. ");
		System.out.println("A decimal point is OK");
	
		double d1,d2;
		d1=scan.nextDouble();
		d2=scan.nextDouble();
		System.out.println("You entered "+d1+" and "+d2);
	
		System.out.println("Next enter two words : ");
		
		String s1,s2;
		s1=scan.next();
		s2=scan.next();
		
		System.out.println("You entered \"" + s1 + "\" and \"" + s2 + "\""); //\",\',\%,\\,\n
		
		//scanf(" %c",c);
		scan.nextLine();
		
		System.out.println("Next enter a line of text");
		s1=scan.nextLine();
		System.out.println("You entered : \"" + s1 + "\"");
	}
}