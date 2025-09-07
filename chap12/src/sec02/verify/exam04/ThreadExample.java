package sec02.verify.exam04;

public class ThreadExample {
	public static void main(String[] args) {
		
		// Thread 구현 클래스로 스레드 생성 후 실행
		Thread thread = new MovieThread();
		thread.setDaemon(true);	// 데몬 스레드로 지정(메인 스레드 종료시 자동 종료)
		thread.start();	// 별도의 스레드에서 run() 실행
		
		try
		{
			// 3초 동안 정지
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			
		}
	}
}
