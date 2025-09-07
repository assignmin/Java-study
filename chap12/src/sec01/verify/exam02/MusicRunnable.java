package sec01.verify.exam02;

public class MusicRunnable implements Runnable {
	
	// run() 메서드 재정의
	@Override
	public void run()
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.println("음악을 재생합니다.");
			try
			{
				// 1초 동안 정지
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
			
			}
		}
	}
}
