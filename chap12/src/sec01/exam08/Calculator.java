package sec01.exam08;

public class Calculator {
	
	private int memory;

	public int getMemory()
	{
		return memory;
	}

	// synchronized 키워드로 동기화 메소드 생성
	public synchronized void setMemory(int memory)
	{
		this.memory = memory;
		try
		{
			// 2초 동안 정지
			Thread.sleep(2000);
		}
		// 다른 스레드가 interrupt()를 호출하면 InterruptedException 발생 
		catch(InterruptedException e)
		{
			
		}	
		// 스레드 이름과 데이터 출력
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
	}
}

