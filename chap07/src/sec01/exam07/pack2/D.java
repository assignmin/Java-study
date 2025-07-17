package sec01.exam07.pack2;

import sec01.exam07.pack1.A;	// 패키지의 A 클래스 import

public class D extends A {	// A 클래스를 상속
	
	// 생성자
	public D() {
		super();	// A 생성자 호출(이건 작성안해도 컴파일러가 자동으로 삽입해줌)
		this.field = "value";
		this.method();
	}
}
