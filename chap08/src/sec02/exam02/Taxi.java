package sec02.exam02;

public class Taxi implements Vehicle {
	
	// run() 추상 메소드 구현(오버라이딩)
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
