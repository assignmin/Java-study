package sec01.exam05;

import java.awt.Toolkit;

public class BeepPrintExample5 {
	public static void main(String[] args) {
		
		Thread thread = new Thread() {
			
			// run() 메서드 재정의
			@Override
			public void run()
			{	
				// Toolkit 클래스에서 현재 플랫폼의 기본 툴킷 객체를 얻음
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++)
				{	
					// 삑 소리 발생
					toolkit.beep();
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
		};
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

