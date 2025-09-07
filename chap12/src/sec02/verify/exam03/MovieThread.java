package sec02.verify.exam03;

public class MovieThread extends Thread {
	
	// run() 메서드 재정의
	@Override
	public void run()
	{
		while(true)
		{
			System.out.println("동영상을 재생합니다.");
			// 인터럽트가 발생한 경우
			if(this.isInterrupted())
			{
				break;
			}
		}
	}
}
