package Person;

public class Player extends Person {
	private int win1 = 0;
	private int win2 = 0;

	Player(String name) {
		super(name);
	}

	int fight(String home, String away) {
		int dice1 = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;

		if (dice1 > dice2) {
			System.out.println("승자는 " + home + "입니다.");
			return win1++;
		}

		else if (dice2 > dice1) {
			System.out.println("승자는 " + away + "입니다.");
			return win2++;
		}

		else {
			System.out.println("무승부입니다. 경기를 다시 시작합니다.");
			return 0;
		}
	}

	void play(Person person) {

		if (person instanceof Student) {
			Student student = (Student) person;

			while (true) {
				if (student.getGrade() <= 90) {
					System.out.println("가서 공부나 하렴 " + student.getName() + "야!");
					break;
				}

				else {
					fight(student.getName(), this.getName());
					student.setGrade(student.getGrade() - 1);
				}
			}
		}

		if (person instanceof Player) {
			Player player = (Player) person;

			System.out.println("주사위 굴리기 10선승!! 10번 이긴 사람이 최종 승자입니다.");

			while (true) {
				fight(this.getName(), player.getName());

				if (win1==10) {
					System.out.println("최종승자는 " + this.getName() + "입니다.");
					break;
				}

				else if (win2==10) {
					System.out.println("최종승자는 " + player.getName() + "입니다.");
					break;
				}
			}
		}
	}
}