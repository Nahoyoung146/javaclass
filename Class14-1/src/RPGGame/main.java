package RPGGame;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		char[] answer = {'a','s'};
		Scanner sc = new Scanner(System.in);
		
		boolean gameover = false;
		Character p0 = new Character(4000);
		Job p1 = new Job("전사", "파워슬래시", 5000);
		Job p2 = new Job("궁수","얼음화살", 3000);
		Job p3 = new Job("마법사", "썬더콜링", 2000);
		Type m1 = new Type ("데스윙", "용족", 5, 10);
		Type m2 = new Type ("물의 정령", "정령", 50, 30000);
		Type m3 = new Type ("피의 악마", "악마", 500, 50000);
		
		Character[] player = {p0, p1, p2, p3};
		Type[] type = {m1,m2,m3};
		
		for(int i=1;i<4;i++) {
			player[i].printinfo();
		}
		
		for(int j=0;j<3;j++) {
			System.out.println("\n");
			System.out.println("몬스터가 나타났습니다. 전투를 시작합니다.");
			type[j].printinfo();
			System.out.println("\n");
			
			while(true) {
				System.out.println("공격방식을 선택하세요. a : 일반공격, s : 스킬사용");
				char yn = sc.next().charAt(0);
				
				if(yn==answer[0]) {
					for(int i=1;i<4;i++) {
						player[i].attack();
						type[j].normalattack(player[i]);
						player[i].win();
					}
				}
				
				else if(yn==answer[1]) {
					for(int i=1;i<4;i++) {
						player[i].skill();
						type[j].skillattack(player[i]);
						player[i].win();
					}
				}
				
				else {
					System.out.println("다시 입력해 주세요.");
					continue;
				}		
					
				if(type[j].getHealth()<=0) {
					System.out.println(type[j].getName() + "이(가) 죽었습니다.");
					break;
				}
				
				for(int i=1;i<4;i++) {
					type[j].attack();
					player[i].monsterattack(type[j]);
					if(player[i].getHealth()<=0) {
						gameover = true;
						j=i;
					}
				}	
				
				if(gameover) {
					System.out.println(player[j].getJob() + "이(가) 죽었습니다.");
					gameover = false;
					break;
				}
			}
		}
	}	
}				