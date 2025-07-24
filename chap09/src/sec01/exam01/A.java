package sec01.exam01;

//바깥 클래스
class A {
	
	A() { System.out.println("A 객체가 생성됨"); }
	
	//인스턴스 멤버 클래스
	public class B {
		
		B() { System.out.println("B 객체가 생성됨"); }
		int field1;
		//static int field2; //Java 17부터 허용(단, 외부에서 객체 생성없이 접근 불가)
		void method1() { }
		//static void method2() { } //Java 17부터 허용(단, 외부에서 객체 생성없이 호출 불가)
	}
	
	//정적 멤버 클래스
	static class C {
		
		C() { System.out.println("C 객체가 생성됨"); }
		int field1;
		static int field2;
		void method1() { }
		static void method2() { }
	}
	
	void method() {
		
		//로컬 클래스
		class D {
			D() { System.out.println("D 객체가 생성됨"); }
			int field1;
			//static int field2; //Java 17부터 허용
			void method1() { }
			//static void method2() { } //Java 17부터 허용
		}
		
		// 객체 생성
		D d = new D();
		d.field1 = 3;
		d.method1();
		//D.field2 = 3; //Java 17부터 허용
		//D.method2(); //Java 17부터 허용
	}
}
