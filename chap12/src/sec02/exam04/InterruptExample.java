package sec02.exam04;

public class InterruptExample {
	public static void main(String[] args)  {
		
		// Thread 구현 클래스로 스레드 생성 후 실행
		Thread thread = new PrintThread();
		thread.start();	// 별도의 스레드에서 run() 실행
		
		try
		{
			// 1초 동안 정지
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			
		}
		
		// thread에 인터럽스 발생
		thread.interrupt();
	}
}
