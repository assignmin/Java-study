package sec04.exam05;

public class Car {
	
	// 필드
	int speed;
	
	// 생성자
	
	// 속도를 반환하는 메소드 선언
	int getSpeed() {
		return speed;
	}
	
	// 키 돌리는 것을 알리는 메소드 선언
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}	
	
	// 차 달리는 메소드 선언
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}	
}
