package sec02.verify.exam02;

public class Anonymous {
	
	// 익명 객체 생성
	Vehicle field = new Vehicle() {
		
		@Override
		// 추상 메서드 재정의
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};

	// 메서드 내부에 익명 객체 생성
	void method1() {
		
		Vehicle localVar = new Vehicle() {
			@Override
			// 추상 메서드 재정의
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		
		localVar.run();
	}
	
	// 익명 객체를 매개변수로 받음
	void method2(Vehicle v) {
		v.run();
	}
}
