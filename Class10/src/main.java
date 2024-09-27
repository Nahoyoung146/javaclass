import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		char[] answer = {'y','n'};
		Scanner sc = new Scanner(System.in);
		
		Player p1 = new Player("철수");
		Monster m1 = new Monster("멧돼지",100);
		
		p1.printinfo();
		
		while(true) {
			System.out.println("몬스터가 나타났습니다. 전투를 시작하겠습니까? (y,n) : ");
			m1.printinfo();
			
			char yn = sc.next().charAt(0);
			
			if(yn==answer[0]) {
				p1.attack();
				p1.win();
			}
			
			else if(yn==answer[1]) {
				m1.attack();
				p1.avoid();
			}
			
			else {
				System.out.println("다시 입력해 주세요.");
			}
		}
	}
}