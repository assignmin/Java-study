package sec06.exam05.package2;

import sec06.exam05.package1.A;	// 패키지의 A 클래스 import

public class C {
	
	// 생성자
	public C() {
		A a = new A();
		a.field1 = 1;   
		//a.field2 = 1;		// 필드의 접근제한자가 default 이므로 다른 패키지 내부에서 선언 불가   
		//a.field3 = 1;   	// 필드의 접근제한자가 private 이므로 다른 클래스에서 선언 불가
		
		a.method1();   
		//a.method2();   	// 메소드의 접근제한자가 default 이므로 다른 패키지 내부에서 선언 불가
		//a.method3();   	// 메소드의 접근제한자가 private 이므로 다른 클래스에서 선언 불가
	}
}


