package sec04.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();	// Calculator 클래스 생성자로 객체 생성
		myCalc.powerOn();	// 메소드 호출
		
		int result1 = myCalc.plus(5, 6);	// 매개변수를 넣어 메소드 호출
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);	// 매개변수를 넣어 메소드 호출(여기서 x와 y는 매개변수로 넘어가면서 둘 다 메소드에 선언된 int 타입으로 형변환)
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();	// 메소드 호출
	}
}
