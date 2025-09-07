package sec02.exam05;

public class DaemonExample {
	public static void main(String[] args) {
		
		// Thread 구현 클래스로 스레드 생성 후 실행
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);	// 데몬 스레드로 지정(데몬스레드는 메인스레드가 종료되면 자동으로 종료)
		autoSaveThread.start();	// 별도의 스레드에서 run() 실행
		
		try
		{
			// 3초 동안 정지
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			
		}
		
		System.out.println("메인 스레드 종료");
	}
}
