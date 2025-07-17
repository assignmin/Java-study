package sec02.exam04;

public class DriverExample {
	public static void main(String[] args) {
		
		// Driver 객체 생성
		Driver driver = new Driver();
		
		// Bus와 Taxi 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 메소드의 인자로 객체를 넘김
		driver.drive(bus);
		driver.drive(taxi);
	}
}
