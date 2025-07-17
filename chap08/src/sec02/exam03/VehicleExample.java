package sec02.exam03;

public class VehicleExample {
	public static void main(String[] args) {
		
		// Bus 객체 생성 후 Vehicle 타입 변수에 대입(다형성), 업캐스팅
		Vehicle vehicle = new Bus();

		vehicle.run();
		//vehicle.checkFare();	// checkFare() 메소드는 Bus 클래스에서 선언한 메소드이므로 Vehicle 타입 변수에서 호출 불가

		Bus bus = (Bus) vehicle;  // 강제 타입 변환(다운캐스팅)

		bus.run();
		bus.checkFare();	// 호출 가능
	}
}