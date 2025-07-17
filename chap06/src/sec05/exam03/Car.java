package sec05.exam03;

public class Car {
	
	// 필드
	int speed;
	
	// 메소드(차 달리기)
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	// 메인 메소드(일반적으로 메인 메소드가 있는 클래스는 실행 진입점 역할만 하고, 다른 필드나 메소드는 잘 선언하지 않는 것이 관례)
	public static void main(String[] args) {
		Car myCar = new Car(); 
		myCar.speed = 60;
		myCar.run();
	}
}

