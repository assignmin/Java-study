package sec01.exam07;

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
		
		// user1이 sleep(2000) 하고 있는 동안, user2가 생성되고 calculator의 memory 값까지 대입이 이루어짐
	}
}
