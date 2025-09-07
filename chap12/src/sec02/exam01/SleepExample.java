package sec02.exam01;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		
		// Toolkit 클래스에서 현재 플랫폼의 기본 툴킷 객체를 얻음
		Toolkit toolkit = Toolkit.getDefaultToolkit();		
		
		for(int i = 0; i < 10; i++)
		{
			// 삑 소리 발생
			toolkit.beep();
			try
			{
				// 3초 동안 정지
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				
			}		
		}	
	}
}
