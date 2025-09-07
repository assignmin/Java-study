package sec02.exam02;

public class StopFlagExample {
	public static void main(String[] args)  {
		
		// Thread 구현 클래스로 스레드 생성 후 실행
		PrintThread printThread = new PrintThread();
		printThread.start();	// 별도의 스레드에서 run() 실행
		
		try
		{
			// 1초 동안 정지
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			
		}
		
		printThread.setStop(true);
	}
}

