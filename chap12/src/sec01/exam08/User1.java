package sec01.exam08;

public class User1 extends Thread {	
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator)
	{
		// 스레드 이름 설정
		this.setName("User1");
		this.calculator = calculator;
	}
	
	// run() 메서드 재정의
	@Override
	public void run()
	{
		calculator.setMemory(100);
	}
}

