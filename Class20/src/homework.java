import java.util.Scanner;
import java.util.ArrayList;

public class homework {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();

		System.out.println("학생 관리 프로그램");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 삭제");
			System.out.println("3. 학생 검색");
			System.out.println("4. 전체 출력");
			System.out.println("5. 평균 점수 출력");
			System.out.println("6. 프로그램 종료");

			int menu = sc.nextInt();
			System.out.println("메뉴 입력 : " + menu);

			if (menu == 1) {
				String name = sc.next();
				System.out.println("이름 입력 : " + name);
				int stnumber = sc.nextInt();
				System.out.println("학번 입력 : " + stnumber);

				if (student.size() == 0) {
					int korea = sc.nextInt();
					System.out.println("국어 점수 입력 : " + korea);

					int english = sc.nextInt();
					System.out.println("영어 점수 입력 : " + english);

					int math = sc.nextInt();
					System.out.println("수학 점수 입력 : " + math);

					System.out.println(name + "이(가) 추가 되었습니다.");
					student.add(new Student(name, korea, english, math, stnumber));
				}

				else {
					for (int i = 0; i < student.size(); i++) {
						if (name.equals(student.get(i).getName())) {
							if (stnumber == student.get(i).getStnumber()) {
								System.out.println("이미 " + name + "이(가) 존재합니다.");
							}

							else if (i == student.size() - 1) {
								int korea = sc.nextInt();
								System.out.println("국어 점수 입력 : " + korea);

								int english = sc.nextInt();
								System.out.println("영어 점수 입력 : " + english);

								int math = sc.nextInt();
								System.out.println("수학 점수 입력 : " + math);

								System.out.println(name + "이(가) 추가 되었습니다.");

								student.add(new Student(name, korea, english, math, stnumber));
								break;
							}
						}

						else if (i == student.size() - 1) {
							int korea = sc.nextInt();
							System.out.println("국어 점수 입력 : " + korea);

							int english = sc.nextInt();
							System.out.println("영어 점수 입력 : " + english);

							int math = sc.nextInt();
							System.out.println("수학 점수 입력 : " + math);

							System.out.println(name + "이(가) 추가 되었습니다.");

							student.add(new Student(name, korea, english, math, stnumber));
							break;
						}
					}
				}
			}

			else if (menu == 2) {
				if (student.size() == 0) {
					System.out.println("삭제할 학생이 없습니다.");
					continue;
				}

				else {
					String name = sc.next();
					System.out.println("이름 입력 : " + name);
					int stnumber = sc.nextInt();
					System.out.println("학번 입력 : " + stnumber);

					for (int i = 0; i < student.size(); i++) {
						if (name.equals(student.get(i).getName())) {
							if (stnumber == student.get(i).getStnumber()) {
								student.remove(i);
								System.out.println(name + "이(가) 삭제되었습니다.");
								break;
							}

							else if (i == student.size() - 1) {
								System.out.println(name + "이(가) 존재하지 않습니다.");
							}
						}

						else if (i == student.size() - 1) {
							System.out.println(name + "이(가) 존재하지 않습니다.");
						}
					}
				}
			}

			else if (menu == 3) {
				if (student.size() == 0) {
					System.out.println("검색할 학생이 없습니다.");
					continue;
				}

				else {
					String name = sc.next();
					System.out.println("이름 입력 : " + name);
					int stnumber = sc.nextInt();
					System.out.println("학번 입력 : " + stnumber);

					for (int i = 0; i < student.size(); i++) {
						if (name.equals(student.get(i).getName())) {
							if (stnumber == student.get(i).getStnumber()) {
								System.out.println(name + "이(가) 있습니다.");
								break;
							}

							else if (i == student.size() - 1) {
								System.out.println(name + "이(가) 존재하지 않습니다.");
							}
						}

						else if (i == student.size() - 1) {
							System.out.println(name + "이(가) 존재하지 않습니다.");
						}
					}
				}
			}

			else if (menu == 4) {
				if (student.size() == 0) {
					System.out.println("출력할 정보가 없습니다.");
				}

				else {
					for (int i = 0; i < student.size(); i++) {
						System.out.println(student.get(i));
					}
				}
			}

			else if (menu == 5) {
				System.out.println("점수 출력 방식");
				System.out.println("1. 과목 평균  2. 학생 평균");
				int num = sc.nextInt();
				System.out.println("번호 입력 : " + num);

				if (num == 1) {
					int sum1 = 0;
					int sum2 = 0;
					int sum3 = 0;

					for (int i = 0; i < student.size(); i++) {
						sum1 += student.get(i).getKorea();
						sum2 += student.get(i).getEnglish();
						sum3 += student.get(i).getMath();
					}

					System.out.println("국어평균 : " + sum1 / student.size());
					System.out.println("영어평균 : " + sum2 / student.size());
					System.out.println("수학평균 : " + sum3 / student.size());
				}

				else if (num == 2) {
					String name = sc.next();
					System.out.println("학생 입력 : " + name);
					int stnumber = sc.nextInt();
					System.out.println("학번 입력 : " + stnumber);
					for (int i = 0; i < student.size(); i++) {
						if (name.equals(student.get(i).getName())) {
							if (stnumber == student.get(i).getStnumber()) {
								int ave = (student.get(i).getKorea() + student.get(i).getEnglish()
										+ student.get(i).getMath()) / 3;
								System.out.println(name + "의 평균 : " + ave);
								break;
							}

							else if (i == student.size() - 1) {
								System.out.println(name + "이(가) 존재하지 않습니다.");
							}
						}

						else if (i == student.size() - 1) {
							System.out.println(name + "이(가) 존재하지 않습니다.");
						}
					}
				}

				else {
					System.out.println("잘못된 입력입니다.");
				}
			}

			else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
			}
		}
	}
}