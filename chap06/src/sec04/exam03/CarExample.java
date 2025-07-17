package sec04.exam03;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();	// Car 클래스 생성자를 호출하여 객체 생성
		
		myCar.setGas(5);  // Car의 setGas() 메소드를 호출하여 가스 값 설정
		
		boolean gasState = myCar.isLeftGas();  // Car의 isLeftGas() 메소드를 호출하여 가스 잔량 여부 확인
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();  // Car의 run() 메소드를 호출하여 차량 운행
		}
		
		if(myCar.isLeftGas()) {  // Car의 isLeftGas() 메소드를 호출하여 가스 잔량 여부 확인
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}

