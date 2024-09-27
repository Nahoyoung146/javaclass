public class class6 {
	public static void main(String[] args) {
		int[] num = new int[7];
				
		for(int i=0; i<7; i++) {
			int n = (int)(Math.random()*45)+1;
			
			for(int j=0; j<7; j++) {
				if(num[j]==n) {
					n = (int)(Math.random()*45)+1;
					j = -1;
				} 
				else if(num[j] == 0) {
					break;
				}
			}
			num[i] = n;
		}
		
		for(int i=0; i<7; i++) {
			System.out.print(num[i] + " ");
		}
	}
}

//캐스팅 (int)var