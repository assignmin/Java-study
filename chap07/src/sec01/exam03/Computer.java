package sec01.exam03;

public class Computer extends Calculator {
	
	// 메소드(부모클래스의 메소드를 재정의)
	@Override
	double areaCircle(double r) {
	System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}


