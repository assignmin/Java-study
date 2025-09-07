package sec02.exam04;

public class PrintThread extends Thread {
	
	// run() 메서드 재정의
	@Override
	public void run()
	{	
		while(true)
		{
			System.out.println("실행 중");
			// 인터럽트가 발생했을 경우
			if(Thread.interrupted())
			{
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}

