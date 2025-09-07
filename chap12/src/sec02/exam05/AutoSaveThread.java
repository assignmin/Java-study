package sec02.exam05;

public class AutoSaveThread extends Thread {
	
	public void save()
	{
		System.out.println("작업 내용을 저장함.");
	}
	
	// run() 메서드 재정의
	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				// 1초 동안 정지
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				break;
			}
			
			save();
		}
	}
}
