package Animal;

public class Duck extends Bird implements Fly, Swim {

	@Override
	public void Eat() {
		System.out.println("물고기를 먹는다.");

	}

	@Override
	public void canFly() {
		System.out.println("강 위를 난다.");

	}

	@Override
	public void canSwim() {
		System.out.println("물 위를 천천히 헤엄친다.");

	}

}
