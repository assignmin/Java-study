package sec02.verify.exam01;

public class AnonymousExample {
	public static void main(String[] args) {
		
		// Anonymous 객체 생성
		Anonymous anony = new Anonymous();
		// 익명 객체 필드 사용
		anony.field.start();
		// 익명 객체 로컬변수 사용
		anony.method1();
		// 익명 객체를 인자로 넘김
		anony.method2(
			new Worker() {
				@Override
				public void start() {
					System.out.println("테스트를 합니다.");
				}
			}
		);
	}
}
