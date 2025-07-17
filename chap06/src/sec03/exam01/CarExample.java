package sec03.exam01;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car("검정", 3000);	// Car 클래스의 생성자에 매개변수를 주어 객체 생성
		//Car myCar = new Car();  (x)	// 클래스 내부에 생성자를 명시적으로 선언하였으므로, 기본 생성자는 자동으로 생성되지 않음
	}
}
