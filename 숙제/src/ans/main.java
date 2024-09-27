package ans;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		RPG maple = new RPG("메이플스토리", 15, "철수", "다양한 직업");
		RPG lostark = new RPG("로스트아크", 10, "영희", "다양한 던전과 필드보스");
		RPG darkdesert = new RPG("검은사막", 5, "민수", "깊이 있는 스토리");

		FPS sudden = new FPS("서든어택", 20, 1, "정확한 에임");
		FPS special = new FPS("스페셜포스", 17, 5, "빠른 속도");
		FPS over = new FPS("오버워치", 15, 7, "침착함");

		RTS star = new RTS("스타크래프트", 25, "테란, 저그, 프로토스", "임요환");
		RTS war = new RTS("워크래프트", 23, "오크, 언데드, 휴먼", "장재호");
		RTS dota = new RTS("도타", 21, "기계, 야수, 정령", "김철수");
		
		RPG[] RPG = {new RPG("메이플스토리", 15, "철수", "다양한 직업"), lostark, darkdesert};
		FPS[] FPS = {sudden, special, over};
		RTS[] RTS = {star, war, dota};

		Scanner sc = new Scanner(System.in);
		System.out.println("게임 이름 맞추기 퀴즈!!");

		int b = 0;

		while (true) {
			System.out.println("장르를 선택하세요 1. RPG 2. FPS 3. RTS");
			int genre = sc.nextInt();
			System.out.println(genre + "번이 선택되었습니다.");
			int a = (int) (Math.random() * 3);

			while (true) {
				if (genre == 1) {
					RPG[a].quiz();
					String answer = sc.next();
					System.out.println("정답 :" + answer);
					
					if(answer.equals(RPG[a].getName())){
						System.out.println("정답입니다.");
						b++;
						break;
					}

					else {
						System.out.println("힌트 제공");
						RPG[a].hint();
						continue;
					}
				}

				else if (genre == 2) {
					FPS[a].quiz();
					String answer = sc.next();
					System.out.println("정답 :" + answer);
					
					if(answer.equals(FPS[a].getName())){
						System.out.println("정답입니다.");
						b++;
						break;
					}

					else {
						System.out.println("힌트 제공");
						FPS[a].hint();
						continue;
					}
				}
				else if (genre == 3) {
					RTS[a].quiz();
					String answer = sc.next();
					System.out.println("정답 :" + answer);
					
					if(answer.equals(RTS[a].getName())){
						System.out.println("정답입니다.");
						b++;
						break;
					}

					else {
						System.out.println("힌트 제공");
						RTS[a].hint();
						continue;
					}
				}
				else {
					System.out.println("잘못된 입력입니다.");
				}
			}
			if (b == 3) {
				System.out.println("모든 문제를 다 맞추셨습니다.");
				break;
			}
		}
	}
}