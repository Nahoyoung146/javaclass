import java.util.Scanner;

public class class5 {
	public static void main(String[] args) {
		int score;
		char grade;
		int[] arr = {0,0,0,0,0,0};
		int min=-1;
		int max=101;
		
		for(int i=1;i<16;i++) {
			System.out.println("Enter your score : ");
			Scanner sc = new Scanner(System.in);
			score=sc.nextInt();
		
			if (score >= 90)
				{grade='A';
				arr[0]++;}
			else if (score >= 80)
				{grade='B';
				arr[1]++;}
			else if (score >= 70)
				{grade='C';
				arr[2]++;}
			else if (score >= 60)
				{grade='D';
				arr[3]++;}
			else
				{grade='E';
				arr[4]++;}
			
			System.out.println("score = " + score + ", Grade = " + grade);
			System.out.println("A = " +arr[0]);
			System.out.println("B = " +arr[1]);
			System.out.println("C = " +arr[2]);
			System.out.println("D = " +arr[3]);
			System.out.println("E = " +arr[4]);		
		
			arr[5] = arr[5] + score;
			
			if(score>min)
				min=score;
		
			if(score<max)
				max=score;
		}
		
		System.out.println("Average = " + arr[5]/15);
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
}