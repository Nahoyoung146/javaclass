
public class Car {
		String name;//인스턴스 변수
		int speed;//인스턴스 변수
		
		void runCar(){
			System.out.println(name+"이(가) 엑셀을 밟아 차가 시속"+speed+"km의 속도로 앞으로 이동합니다.");
		}
		
		void breakCar(){
			System.out.println(name+"이(가) 브레이크를 밟아 차가 멈춥니다.");
		}
		
		@Override
		public String toString() {
			return "이름 : " + name + ", 속력 : " + speed;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Car) {
				Car car = (Car) obj;
				return this.name.equals(car.name);
			}
			return false;
		}
}