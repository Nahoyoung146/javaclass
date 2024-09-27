import java.util.ArrayList;
import java.util.Scanner;

public class class20 {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();

		fruits.add("바나나");
		fruits.add("키위");
		fruits.add("오렌지");
		fruits.add("사과");

		System.out.println("과일은 " + fruits.size() + "개입니다.");

		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));

		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}

		fruits.remove(1);
		System.out.println("과일은 " + fruits.size() + "개입니다.");

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		for (int i = 0; i < fruits.size(); i++) { // String fruit : fruits
			String fruit = fruits.get(i);
			System.out.println(fruit);
		}

		fruits.clear();
		System.out.println("과일은 " + fruits.size() + "개입니다.");
		// 사용자에게 String을 입력 받아서 해당 ArrayList에 과일이 들어 있는지 찾아보기
		boolean check = true;

		fruits.add("바나나");
		fruits.add("키위");
		fruits.add("오렌지");
		fruits.add("사과");

		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		System.out.println("과일 입력 : " + answer);

		for (int i = 0; i < fruits.size(); i++) {
			if (answer.equals(fruits.get(i))) {
				System.out.println(answer + "이(가) 있습니다.");
				break;
			}

			else if (i == fruits.size() - 1) {
				System.out.println(answer + "이(가) 없습니다.");
			}
		}

		for (String fruit : fruits) {
			if (answer.equals(fruit)) {
				System.out.println(answer + "이(가) 있습니다.");
				check = false;
				break;
			}
		}

		if (check) {
			System.out.println(answer + "이(가) 없습니다.");
		}

		System.out.println(fruits.contains(answer)); // true or false
	}
}

//ArrayList
//동적 배열, 자바에서 가장 많이 쓰는 자료구조

//특징
//크기가 가변적이다. → 추가, 삭제가 가능하다.
//배열과 같이 인덱스 번호로 접근 가능하다.
//객체만을 지향한다.

//ArrayList<객체> 배열명 = new ArrayList<>(); //import
//ArrayList<Student> studentList = new ArrayList<Student>();

//get(int index) : 지정된 인덱스 위치가 요소를 변환하다. arr[index] - student.get(index)
//add(E element) : 요소를 arrayList 끝에 추가한다. student.add(kim)
//remove(int index) : 지정한 인덱스 위치의 요소를 삭제한다. student.remove(2)
//size() : arrayList 사이즈를 반환한다. arr.length()
//clear() : arrayList의 모든 요소를 삭제한다.