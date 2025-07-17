package sec02.exam02;

public class DriverExample {
	public static void main(String[] args) {
		
		// Driver 객체 생성
		Driver driver = new Driver();
		
		// Bus 객체와 Taxi 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 메소드의 인자로 Bus 타입 객체와 Taxi 타입 객체 넘겨줌(두 타입 모두 Vehicle 인터페이스 구현 클래스이므로 가능)
		driver.drive(bus);
		driver.drive(taxi);
	}
}
