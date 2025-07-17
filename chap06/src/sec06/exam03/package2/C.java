package sec06.exam03.package2;

import sec06.exam03.package1.*;	// 패키지의 클래스, 인터페이스 등 모두 import

public class C {	// C 클래스 선언(접근제한자는 public)
	
	//A a;	// A가 선언된 패키지와 다른 패키지이므로 선언 불가(A의 접근제한자가 default 이기 때문에 import 해도 사용 불가능)
	B b;	// B가 선언된 패키지와 다른 패키지이지만 선언 가능(B의 접근제한자가 public 이기 때문에 import 해서 사용 가능)
}

