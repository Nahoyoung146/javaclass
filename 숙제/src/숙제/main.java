package 숙제;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Maple maple = new Maple("메이플스토리", 15, "철수", "다양한 직업");
		Lostark lostark = new Lostark("로스트아크", 10, "영희", "다양한 던전과 필드보스");
		Darkdesert darkdesert = new Darkdesert("검은사막", 5, "민수", "깊이 있는 스토리");

		Suddenattack sudden = new Suddenattack("서든어택", 20, 1, "정확한 에임");
		Specialforce special = new Specialforce("스페셜포스", 17, 5, "빠른 속도");
		Overwatch over = new Overwatch("오버워치", 15, 7, "침착함");

		Starcraft star = new Starcraft("스타크래프트", 25, "테란, 저그, 프로토스", "임요환");
		Warcraft war = new Warcraft("워크래프트", 23, "오크, 언데드, 휴먼", "장재호");
		Dota dota = new Dota("도타", 21, "기계, 야수, 정령", "김철수");

		Scanner sc = new Scanner(System.in);
		System.out.println("게임 이름 맞추기 퀴즈!!");

		int b = 0;

		while (true) {
			System.out.println("장르를 선택하세요 1. RPG 2. FPS 3. RTS");
			int genre = sc.nextInt();
			System.out.println(genre + "번이 선택되었습니다.");
			int a = (int) (Math.random() * 3) + 1;

			while (true) {
				if (genre == 1) {
					if (a == 1) {
						maple.quizMaple();
						String answer = sc.next();
						System.out.println("정답 :" + answer);
						if (answer.equals("메이플스토리")) {
							System.out.println("정답입니다.");
							b++;
							break;
						}

						else {
							System.out.println("힌트 제공");
							maple.hint();
							continue;
						}
					}

					else if (a == 2) {
						lostark.quizLostark();
						String answer = sc.next();
						System.out.println("정답 :" + answer);
						if (answer.equals("로스트아크")) {
							System.out.println("정답입니다.");
							b++;
							break;
						}

						else {
							System.out.println("힌트 제공");
							lostark.hint();
							continue;
						}
					}

					else {
						darkdesert.quizDarkdesert();
						String answer = sc.next();
						System.out.println("정답 :" + answer);
						if (answer.equals("검은사막")) {
							System.out.println("정답입니다.");
							b++;
							break;
						}

						else {
							System.out.println("힌트 제공");
							darkdesert.hint();
							continue;
						}
					}
				}

				else if (genre == 2) {
					if (a == 1) {
						sudden.quizSuddenattack();
						String answer = sc.next();
						System.out.println("정답 :" + answer);
						if (answer.equals("서든어택")) {
							System.out.println("정답입니다.");
							b++;
							break;
						}

						else {
							System.out.println("힌트 제공");
							sudden.hint();
							continue;
						}
					}

					else if (a == 2) {
						special.quizSpecialforce();
						String answer = sc.next();
						System.out.println("정답 :" + answer);
						if (answer.equals("스페셜포스")) {
							System.out.println("정답입니다.");
							b++;
							break;
						}

						else {
							System.out.println("힌트 제공");
							special.hint();
							continue;
						}
					}

					else {
						over.quizOverwatch();
						String answer = sc.next();
						System.out.println("정답 :" + answer);
						if (answer.equals("오버워치")) {
							System.out.println("정답입니다.");
							b++;
							break;
						}

						else {
							System.out.println("힌트 제공");
							over.hint();
							continue;
						}
					}
				}

				else if (genre == 3) {
					if (a == 1) {
						star.quizStarcraft();
						String answer = sc.next();
						System.out.println("정답 :" + answer);
						if (answer.equals("스타크래프트")) {
							System.out.println("정답입니다.");
							b++;
							break;
						}

						else {
							System.out.println("힌트 제공");
							star.hint();
							continue;
						}
					}

					else if (a == 2) {
						war.quizWarcraft();
						String answer = sc.next();
						System.out.println("정답 :" + answer);
						if (answer.equals("워크래프트")) {
							System.out.println("정답입니다.");
							b++;
							break;
						}

						else {
							System.out.println("힌트 제공");
							war.hint();
							continue;
						}
					}

					else {
						dota.quizDota();
						String answer = sc.next();
						System.out.println("정답 :" + answer);
						if (answer.equals("도타")) {
							System.out.println("정답입니다.");
							b++;
							break;
						}

						else {
							System.out.println("힌트 제공");
							dota.hint();
							continue;
						}
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