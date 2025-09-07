package sec01.exam06;

public class ThreadB extends Thread {	
	
	// run() 메서드 재정의
	@Override
	public void run()
	{		
		for(int i=0; i<2; i++)
		{		
			// 스레드의 이름 출력
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}

