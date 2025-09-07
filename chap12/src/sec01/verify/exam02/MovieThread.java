package sec01.verify.exam02;

public class MovieThread extends Thread {
	
	// run() 메서드 재정의
	@Override
	public void run()
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.println("동영상을 재생합니다.");
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
