package sec02.exam01;

public class CarExample {
	public static void main(String[] args) {
		
		// Car 객체 생성
		Car myCar = new Car();
		
		// 메소드 실행
		myCar.run();
		
		// myCar의 필드 값 변경
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}
}
