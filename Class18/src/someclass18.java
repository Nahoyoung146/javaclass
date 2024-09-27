
public class someclass18 {
	public static void main(String[] args) {

		Math.add(5, 3);
		System.out.println(Math.sum);
		
		Math.add(5, 3, 1, 1, 2, 3, 4, 5);
		System.out.println(Math.sum);
	}
}

class Math {
	static int sum;

	static int add(int a, int b) {
		sum = a + b;
		return sum;
	}

	static int add(int a, int b, int c) {
		sum = a + b + c;
		return sum;
	}
	
//	static int add(int[] arr) {
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		return sum;
//	}
	
	static int add(int...arr) {
		for(int a : arr) {
			sum += a;
		}
		return sum;
	}
}

//가변인자(varargs)
//동적으로 파라미터를 받을 수 있다.
//매개변수가 몇 개까지 들어올지 예상하기 어려워서 오버로딩을 통한 메서드를 여러 개 만드는 것을 방지한다.