package sec02.exam02;

public class Anonymous {
	
	// 익명 객체 생성
	RemoteControl field = new RemoteControl() {
		
		@Override
		// 추상 메서드 재정의
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		// 추상 메서드 재정의
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	// 메서드 내부에서 익명 객체 생성
	void method1() {
		
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			// 추상 메서드 재정의
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			// 추상 메서드 재정의
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		
		// 로컬변수 사용
		localVar.turnOn();
	}
	
	// 익명 객체를 매개변수로 받기
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}











