import java.util.Scanner;

public class class7 {
	public static void main(String[] args) {
	
	int[] arr = new int[400];		
	int[] arr1 = new int[400];
	int[] arr2 = {1,2,3,4,5,6,7};
	
	for(int i=0;i<400;i++) {
		arr[i]=i+1;
		System.out.println(arr[i]);
	}
	
	for(int i=0;i<400;i++) {
		arr1[i]= (i+1)*2;
		System.out.println(arr1[i]);
		}
	
	
	String[] str = new String[5];
	String str1;
	
	Scanner sc = new Scanner(System.in);
	
	for(int i=0;i<5;i++) {
		str[i]=sc.next();
		System.out.print(str[i]+" ");
	}
	
	for(int i=0;i<5;i++) {
	str1=sc.next();
	
	if(str1.equals(str[i]))
	System.out.println("일치");
	
	else
	System.out.println("불일치");
		}
	
	int[][] arr3 = new int[10][10]; 
	
	for(int i=0;i<10;i++) {
		for(int j=0;j<10;j++) {
			arr3[i][j]=10*i+j+1;
			System.out.println(arr3[i][j]);
		}
		System.out.println();
		}
	}
}

//배열 (array)
//자료형[] 배열명 = new 자료형[크기]
//int[] arr = new int[4]
//int[][] arr = new int[4][6]
