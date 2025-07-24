package sec01.exam01;

public class Main {
	public static void main(String[] args) {
		
		// A 객체 생성
		A a = new A();
		
		// A 클래스의 인스턴스 멤버 클래스 B 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		//A.B.field2 = 3; // Java 17부터 허용
		//A.B.method2(); 	// Java 17부터 허용
		
		// A 클래스의 정적 멤버 클래스 C 객체 생성(외부 클래스의 객체 생성없이 가능)
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
