import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		System.out.println("단어 프로그램");

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 단어 추가");
			System.out.println("2. 단어 검색");
			System.out.println("3. 전체출력");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.print("추가할 단어 입력 : ");
				String word = sc.next();
				if (list.size() == 0) {
					System.out.println(word + "(이)가 추가되었습니다.");
					list.add(word);
				}

				else {
					for (int i = 0; i < list.size(); i++) {
						if (word.equals(list.get(i))) {
							System.out.println("이미 추가한 단어입니다.");
						}

						else if (i == list.size() - 1) {
							System.out.println(word + "(이)가 추가되었습니다.");
							list.add(word);
							break;
						}
					}
				}
			}

			else if (num == 2) {
				if (list.size() == 0) {
					System.out.println("목록에 검색할 단어가 없습니다.");
				}

				else {
					int a = 0;
					System.out.print("검색할 단어 입력 : ");
					String word = sc.next();
					for (int i = 0; i < list.size(); i++) {
						if (word.equals(list.get(i))) {
							System.out.println("검색한 단어가 목록에 있습니다.");
							break;
						}

						else if (i == list.size() - 1) {
							System.out.println("검색한 단어가 목록에 없습니다.");
						}
					}

					for (int i = 0; i < list.size(); i++) {
						for (int k = 0; k < list.get(i).length(); k++) {
							for (int j = k + 1; j < list.get(i).length() + 1; j++) {
								if (word.equals(list.get(i).substring(k, j)) && word.length() != list.get(i).length()) {
									System.out.println("검색한 단어를 포함한 단어 : " + list.get(i));
									a++;
								}
							}
						}

						if (i == list.size() - 1 && a == 0) {
							System.out.println("검색한 단어를 포함한 단어가 없습니다.");
						}
					}
				}
			}

			else if (num == 3) {
				if (list.size() == 0) {
					System.out.println("출력할 정보가 없습니다.");
				}

				else {
					for (int i = 0; i < list.size(); i++) {
						System.out.println((i + 1) + ". " + list.get(i));
					}
					System.out.println();
				}
			}

			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}

// 단어 검색 : 이클립스 -> 이클 (이클립스, 이클, 이클루)