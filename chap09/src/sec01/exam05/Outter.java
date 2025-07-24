package sec01.exam05;

public class Outter {
	
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	// 내부 클래스
	class Nested {
		
		String field = "Nested-field";
		
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			
			System.out.println(this.field);	// 현재 클래스 위치의 this
			this.method();	// 현재 클래스 위치의 this
			System.out.println(Outter.this.field);	// 외부 클래스 위치의 this
			Outter.this.method();	// 외부 클래스 위치의 this
		}
	}
}
