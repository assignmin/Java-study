package sec02.exam03;

public class Bus implements Vehicle {
	
	// run() 추상 메소드 구현(오버라이딩)
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	// 메소드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
