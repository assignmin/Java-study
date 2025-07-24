package sec02.verify.exam01;

public class Anonymous {
	
	// 익명 객체 생성
	Worker field = new Worker() {
		
		@Override
		// 메서드 재정의
		public void start() {
			System.out.println("디자인을 합니다.");
		}
	};

	// 메서드 내부에서 익명 객체 생성
	void method1() {
		
		Worker localVar = new Worker() {
			
			@Override
			// 메서드 재정의
			public void start() {
				System.out.println("개발을 합니다.");
			}
		};

		localVar.start();
	}

	// 익명 객체를 매개변수로 받음
	void method2(Worker worker) {
		worker.start();
	}
}
