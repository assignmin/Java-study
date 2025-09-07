package sec01.exam08;

public class MainThreadExample {
	public static void main(String[] args) {
		
		// Calculator 인스턴스 생성
		Calculator calculator = new Calculator();
		
		// 스레드 생성하고 calculator 대입 후 실행
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();	// 별도의 스레드에서 run() 실행 (비동기적 실행)

		// 스레드 생성하고 calculator 대입 후 실행
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();	// 마찬가지로 별도의 스레드에서 run() 실행 (비동기적 실행)
		
		// synchornized 키워드 때문에 calculator의 setMemory() 메서드는 더 이상 병렬처리 불가
	}
}
