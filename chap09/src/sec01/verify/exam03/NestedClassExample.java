package sec01.verify.exam03;

public class NestedClassExample {
	public static void main(String[] args) {
		
		// Car 객체 생성
		Car myCar = new Car();
		
		// Car 클래스의 인스턴스 멤버 클래스인 Tire 객체 생성(외부클래스의 객체가 반드시 먼저 생성되어야 함)
		Car.Tire tire = myCar.new Tire();
		
		// Car 클래스의 정적 멤버 클래스인 Engine 객체 생성(외부클래스의 객체가 생성되지 않았더라도 생성 가능)
		Car.Engine engine = new Car.Engine();
	}
}
