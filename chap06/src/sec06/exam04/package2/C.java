package sec06.exam04.package2;

import sec06.exam04.package1.A;	// 패키지의 A 클래스 import

public class C {
	
	// 필드
	A a1 = new A(true);
	// A a2 = new A(1);			// 생성자의 접근제한자가 default 이므로 다른 패키지 내부에서 선언 불가
	// A a3 = new A("문자열");	// 생성자의 접근제한자가 private 이므로 다른 클래스에서 선언 불가
}
