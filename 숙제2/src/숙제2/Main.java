package 숙제2;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int c = 0, d = 0;
	
	public static int[] infogame(Character[] cha) {
		System.out.println("게임 시작\n마법카드와 직업스킬은 곻격 전에 한번만 사용가능합니다.\n함정카드는 한 턴 당 한 번만 사용가능합니다.");
		System.out.println("캐릭터를 선택하세요.\n1.전사 2.도적 3.마법사");
		System.out.print("플레이어 1 : ");
		int player1 = sc.nextInt();
		System.out.print("플레이어 2 : ");
		int player2 = sc.nextInt();
		System.out.println(cha[player1 - 1] + "\n" + cha[player2 - 1]);
		int[] arr = { player1, player2 };
		return arr;
	}

	public static int choice() {
		System.out.print("행동 선택\n1. 공격 2. 마법카드 사용 3. 직업스킬 사용\n번호 입력 : ");
		int cho1 = sc.nextInt();
		return cho1;
	}

	public static void attack(Character[] cha, int player1, int player2) {
		cha[player1 - 1].Attack(cha[player2 - 1]);
	}
	
	public static void macho(Magic[] ma, Character[] cha, int num, int player1) {
		if(num==1 || num==2) {
			ma[num-1].skill(cha[player1 - 1], cha[player1 - 1]);
		}
		else if(num==3) {
			ma[num-1].skill2(cha[player1 - 1], cha[player1 - 1]);
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}

	public static void magic(Magic[] ma, Character[] cha, int player1) {
		System.out.print("마법카드 선택\n1. 본인 공격력 2배 2. 본인 공격력 무작위로배수 3. 본인 체력 3배\n번호 입력 : ");
		int cho2 = sc.nextInt();
		macho(ma, cha, cho2, player1);
	}
	
	public static void skcho(Character[] cha, int num1, int num2) {
		if(num1==1 || num1==2) {
			cha[num1-1].skill2(cha[num1 - 1], cha[num2 - 1]);
		}
		else if(num1==3) {
			cha[num1-1].skill(cha[num1 - 1], cha[num2 - 1]);
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}

	public static void skill(Character[] cha, int player1, int player2) {
		System.out.println("직업스킬을 발동합니다.");
		skcho(cha,player1,player2);
	}
	
	public static void trcho(Trap[] tr, Character[] cha, int num, int player1, int player2) {
		if(num==1 || num==2) {
			tr[num-1].skill(cha[player1 - 1], cha[player2 - 1]);
		}
		else if(num==3) {
			tr[num-1].skill2(cha[player1 - 1], cha[player2 - 1]);
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}

	public static void trap(Trap[] tr, Character[] cha, int player1, int player2) {
		System.out.print("상대방 함정카드 선택\n1. 상대 체력 반만큼 공격력 증가 2. 상대 공격 되돌려주기 3. 상대 체력과 내 체력 동일\n번호 입력 : ");
		int cho3 = sc.nextInt();
		trcho(tr, cha, cho3, player2, player1);
	}

	public static void atkandmaandsk(Character[] cha, Magic[] ma, int player1, int player2) {
		while (true) {
			int cho1 = choice();
			if (cho1 == 1) {
				attack(cha, player1, player2);
				break;
			}

			else if (cho1 == 2) {
				if (c == 0) {
					magic(ma, cha, player1);
				}

				else {
					System.out.println("이미 마법카드를 사용했습니다.");
				}

				c++;
			}

			else if (cho1 == 3) {
				if (d == 0) {
					skill(cha, player1, player2);
				}

				else {
					System.out.println("이미 직업스킬을 사용했습니다.");
				}

				d++;
			}

			else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}

	public static void initial() {
		c = 0;
		d = 0;
	}

	public static boolean finish(int over, boolean reverse) {
		if (over == 1) {
			if (reverse)
				System.out.println("플레이어2 승리!!");
			else
				System.out.println("플레이어1 승리!!");
			return true;
		} else if (over == 2) {
			if (reverse)
				System.out.println("플레이어1 승리!!");
			else
				System.out.println("플레이어2 승리!!");
			return true;
		}
		return false;
	}

	public static boolean overroll(Character[] cha, Magic[] ma, Trap[] tr, int player1, int player2, boolean reverse) {
		atkandmaandsk(cha, ma, player1, player2);
		int over1 = gameover(cha, player1, player2);

		if (finish(over1, reverse))
			return true;

		trap(tr, cha, player1, player2);
		int over2 = gameover(cha, player1, player2);

		if (finish(over2, reverse))
			return true;

		initial();

		return false;
	}

	public static int gameover(Character[] cha, int player1, int player2) {
		if (cha[player1 - 1].getHealth() <= 0) {
			return 1;
		}

		else if (cha[player2 - 1].getHealth() <= 0) {
			return 2;
		}
		return 0;
	}

	public static void main(String[] args) {
		Character[] cha = { new Knight("가", "전사", 400, 100), new Assassin("나", "어쌔신", 300, 50),
				new Magician("다", "마법사", 350, 20) };
		Magic[] ma = { new Attackdouble("라"), new Attackmultiran("마"), new Healthtriple("바") };
		Trap[] tr = { new Attackhalfofenemy("사"), new Reverseattack("아"), new Samehealth("자") };
		int[] arr = infogame(cha);
		int player1 = arr[0];
		int player2 = arr[1];
		while (true) {
			int a = (int) (Math.random() * 2);
			int b = (int) (Math.random() * 2);
			if (a > b) {
				System.out.println("플레이어1이(가) 선공입니다.");
				while (true) {
					int first = player1;
					int second = player2;
					if (overroll(cha, ma, tr, first, second, true))
						break;

					if (overroll(cha, ma, tr, second, first, false))
						break;
				}
				break;
			}

			else if (a < b) {
				System.out.println("플레이어2이(가) 선공입니다.");
				while (true) {
					int first = player2;
					int second = player1;
					if (overroll(cha, ma, tr, first, second, false))
						break;

					if (overroll(cha, ma, tr, second, first, true))
						break;
				}
				break;
			}

			else {
				System.out.println("선공을 다시 정하겠습니다.");
			}
		}
	}
}