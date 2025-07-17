package sec02.exam04;

public class Driver {
	
	// 매개변수로 Vehicle 타입의 객체를 받는 메소드
	public void drive(Vehicle vehicle) {
		
		// 매개변수로 받은 객체가 Bus 타입인지 확인
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;	// 강제 타입 변환(다운캐스팅)
			bus.checkFare();
		}
		vehicle.run();
	}
}
