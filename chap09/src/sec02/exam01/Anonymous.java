package sec02.exam01;

public class Anonymous {
	
	// 익명 객체 생성
	Person field = new Person() {
		
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		// 메서드 재정의
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	// 메서드 내부에서 익명 객체 생성
	void method1() {
		
		Person localVar = new Person() {
			
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			// 메서드 재정의
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		
		// 로컬변수 사용
		localVar.wake();
	}
	
	// 익명 객체를 매개변수로 받기
	void method2(Person person) {
		person.wake();
	}
}











