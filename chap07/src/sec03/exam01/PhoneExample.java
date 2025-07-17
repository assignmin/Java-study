package sec03.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		
		//Phone phone = new Phone();	// Phone 클래스에 기본생성자 존재 x
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();	// 상속받았으므로 부모타입 메소드 호출 가능
		smartPhone.internetSearch();
		smartPhone.turnOff();	// 상속받았으므로 부모타입 메소드 호출 가능
	}
}
