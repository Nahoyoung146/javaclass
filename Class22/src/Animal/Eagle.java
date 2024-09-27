package Animal;

public class Eagle extends Bird implements Fly {

	@Override
	public void Eat() {
		System.out.println("고기를 먹는다.");

	}

	@Override
	public void canFly() {
		System.out.println("하늘을 높게 난다.");

	}

}
