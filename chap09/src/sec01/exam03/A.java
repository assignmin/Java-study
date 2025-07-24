package sec01.exam03;

public class A {
	
	int field1;
	void method1() { }
	
	static int field2;
	static void method2() { }
	
	// 인스턴스 멤버 클래스
	class B {
		
		void method() {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}
	
	// 정적 멤버 클래스
	static class C {
		
		// 외부 클래스의 인스턴스 멤버 필드이므로 정적 멤버 클래스에서 직접 접근 불가
		void method() {
			//field1 = 10;
			//method1();

			field2 = 10;
			method2();
		}
	}	
}
