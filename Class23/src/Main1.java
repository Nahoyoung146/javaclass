
public class Main1 {

	public static void main(String[] args) {
		System.out.println(I1.num);
		System.out.println(I2.num2);

//		I1.num = 2;
//		I2.num2 = 3;

	}

}

interface I1 {
	public static final int num = 1;

	public abstract void a();
}

interface I2 {
	int num2 = 2;

	void b();
}

interface I3 {
}

class C1 implements I1 {
	public void a() {

	}
}

class C2 implements I1, I2, I3 {
	public void a() {

	}

	public void b() {

	}

}