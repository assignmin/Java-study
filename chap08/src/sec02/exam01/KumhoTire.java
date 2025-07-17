package sec02.exam01;

public class KumhoTire implements Tire {
	
	// roll() 추상 메소드 구현(오버라이딩)
	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}
