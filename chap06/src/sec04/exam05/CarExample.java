package sec04.exam05;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();	// Car 클래스 생성자를 호출하여 객체 생성
		myCar.keyTurnOn();	// 키 돌리는 메소드 호출
		myCar.run();	// 차 달리는 메소드 호출
		int speed = myCar.getSpeed();	//속도 얻기
		System.out.println("현재 속도: " + speed + "km/h");
	}
}
