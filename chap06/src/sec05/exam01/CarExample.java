package sec05.exam01;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car("포르쉐");	// Car 객체 생성
		Car yourCar = new Car("벤츠");	// Car 객체 생성
		
		myCar.run();	// 차 운행
		yourCar.run();	// 차 운행
	}
}
