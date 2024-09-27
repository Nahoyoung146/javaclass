
public class Main {

	public static void main(String[] args) {
		Bike bike = new Bike();
		Bicycle bicycle = new Bicycle();

		bike.UpSpeed();
		bike.ChangeGear();
		bike.Stop();

		System.out.println();

		bicycle.UpSpeed();
		bicycle.ChangeGear();
		bicycle.Stop();

		System.out.println();

		while (true) {
			bike.Destination();
			bicycle.Destination();

			System.out.println();

			if (bike.getDistance() >= 20 || bicycle.getDistance() >= 20) {
				if (bike.getDistance() > bicycle.getDistance()) {
					System.out.println("오토바이가 더 먼저 도착했습니다.");
				}

				else if (bike.getDistance() < bicycle.getDistance()) {
					System.out.println("자전거가 더 먼저 도착했습니다.");
				}

				else {
					System.out.println("동시에 도착하였습니다.");
				}

				break;
			}
		}

	}

}
