package sec02.exam03;

public class KumhoTire extends Tire {
	
	// 필드
	
	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);	// 부모클래스의 생성자 호출
	}	
	
	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {	// 누적 회전수가 최대 회전수보다 작다면
			System.out.println(location + " KumhoTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
