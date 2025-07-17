package sec01.exam03;

public class ComputerExample {
	public static void main(String[] args) {		
		
		int r = 10;
		
		// Calculator 객체 생성
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));		
		System.out.println();
		
		// Computer 객체 생성
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
	}
}

