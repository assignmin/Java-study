package sec01.exam04;

public class SupersonicAirplane extends Airplane {
	
	// 필드(상수 선언)
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	// 메소드(부모클래스의 메소드 재정의)
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");			
		} else {
			// Airplane 객체의 fly() 메소드 호출
			super.fly();
		}
	}
}

