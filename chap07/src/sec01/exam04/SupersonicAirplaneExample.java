package sec01.exam04;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {			
		
		// SupersonicAirplane 객체 생성
		SupersonicAirplane sa = new SupersonicAirplane();		
		sa.takeOff();
		sa.fly();		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;	// 상수로 값 변경
		sa.fly();		
		sa.flyMode = SupersonicAirplane.NORMAL;	// 상수로 값 변경
		sa.fly();		
		sa.land();
	}
}

