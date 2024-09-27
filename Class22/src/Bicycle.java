
public class Bicycle implements Vehicle {

	private int gear;
	private int speed;
	private int distance;

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public void ChangeGear() {
		if (this.speed < 4) {
			this.gear = 1;
		}

		else if (this.speed < 7) {
			this.gear = 2;
		}

		else if (this.speed < 9) {
			this.gear = 3;
		}

		else {
			this.gear = 4;
		}
		System.out.println("자전거의 현재기어는 " + this.gear + "단입니다.");
	}

	@Override
	public void UpSpeed() {
		this.speed = (int) (Math.random() * 10) + 1;
		System.out.println("자전거의 현재속도는 시속" + this.speed + "km/h입니다.");
	}

	@Override
	public void Stop() {
		System.out.println("브레이크를 겁니다.");
	}

	@Override
	public void Destination() {
		UpSpeed();
		this.distance += this.speed;
		System.out.println("자전거의 이동거리 :" + this.distance);
	}

}
