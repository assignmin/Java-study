package sec02.exam02;

public class AnonymousExample {
	public static void main(String[] args) {
		
		// Anonymous 객체 생성
		Anonymous anony = new Anonymous();
		// 익명 객체 필드 사용
		anony.field.turnOn();
		// 익명 객체 로컬변수 사용
		anony.method1();
		// 익명 객체를 인자로 넘김
		anony.method2(
			new RemoteControl() {
				
				@Override
				// 추상메서드 재정의
				public void turnOn() {
					System.out.println("SmartTV를 켭니다.");
				}
				@Override
				// 추상메서드 재정의
				public void turnOff() {
					System.out.println("SmartTV를 끕니다.");
				}
			}
		);
	}
}
