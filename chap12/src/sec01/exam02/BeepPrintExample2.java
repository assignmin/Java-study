package sec01.exam02;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		
		// BeepTask 객체를 Runnable 타입 beepTask에 대입
		Runnable beepTask = new BeepTask();
		// beepTask를 실행할 스레드 생성
		Thread thread = new Thread(beepTask);
		// 스레드 실행
		thread.start();
		
		for(int i=0; i<5; i++)
		{
			System.out.println("띵");
			try
			{
				// 0.5초 동안 정지
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}


