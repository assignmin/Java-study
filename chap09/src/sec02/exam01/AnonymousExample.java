package sec02.exam01;

public class AnonymousExample {
	public static void main(String[] args) {
		
		// Anonymous 객체 생성
		Anonymous anony = new Anonymous();
		// 익명 객체 필드 사용
		anony.field.wake();
		// 익명 객체 로컬변수 사용
		anony.method1();
		// 익명 객체를 인자로 넘김
		anony.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다.");
				}
				@Override
				// 메서드 재정의
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
			}
		);
	}
}
