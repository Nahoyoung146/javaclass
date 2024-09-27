
public class homework {
	public static void main(String[] args) {
		int[][] Num=new int[8][8];
		int a=1;
		
		for(int i=0; i<Num.length; i++) {
			for(int j=0; j<Num[0].length; j++) {
				Num[i][j]=a++;
			}
		}
				
		for(int i=0; i<Num.length; i++) {
			for(int j=0; j<Num.length; j++) {
				System.out.print(Num[i][j] + " \t");
			}
			System.out.println();
		}		
			
			System.out.println("------------------------------------------------------------");
		
		for(int i=0; i<Num.length; i++) {
			for(int j=0; j<Num.length; j++) {
				if(i<Num.length/2 && (j==Num.length/2-1-i || j==i+Num.length/2)) {
					Num[i][j]=0;
			}
				if(i>=Num.length/2 && (j==i-Num.length/2 || j==Num.length+Num.length/2-1-i)) {
					Num[i][j]=0;
			}
				System.out.print(Num[i][j] + " \t");
			}
			System.out.println();
		}		
		
			System.out.println("------------------------------------------------------------");	
		
		for(int i=0; i<Num.length; i++) {
			for(int j=0; j<Num.length; j++) {
					Num[i][j]=Num.length*i+1+j;
//					for(int k=1; k<Num.length/2; k+=2) {
//						if(k<=i && i<=Num.length-k-1) {
//							if(j==k || j == Num.length-k-1) {
//								Num[i][j] = 0;
//							}
//						}
//						if(k==i || i==Num.length-k-1) {
//							if(k<j&&j<Num.length-k-1) {
//								Num[i][j] = 0;
//							}
//						}
//					}
					for(int k=1; k<Num.length; k++) {
						if(2*k-1<=i && i<=Num.length-2*k) {
							if(j==2*k-1||j==Num.length-2*k) {
									Num[i][j]=0;
							}
						}

						if(i==2*k-1 || i==Num.length-2*k) {
							if(2*k-1<j&&j<Num.length-2*k) 	{
									Num[i][j]=0;
							}
						}
					}
						System.out.print(Num[i][j] + " \t");
			}
			System.out.println();
		}
	}
}