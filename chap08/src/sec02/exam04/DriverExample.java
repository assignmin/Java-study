package sec02.exam04;

public class DriverExample {
	public static void main(String[] args) {
		
		// Driver 객체 생성
		Driver driver = new Driver();
		
		// Bus, Taxi 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 인자로 Bus 타입의 객체와 Taxi 타입의 객체를 넘겨서 메소드 호출
		driver.drive(bus);
		driver.drive(taxi);
	}
}
