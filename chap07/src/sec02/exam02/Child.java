package sec02.exam02;

public class Child extends Parent {	// Parent 클래스 상속받음
	
	// 부모 클래스 메소드 재정의
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
