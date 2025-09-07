package sec01.exam04;

public class BeepPrintExample4 {
	public static void main(String[] args) {
		
		// 스레드 생성
		Thread thread = new BeepThread();
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

