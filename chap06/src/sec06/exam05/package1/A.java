package sec06.exam05.package1;

public class A {
	
	// 필드
	public int field1;	// 접근제한자 public
	int field2;			// 접근제한자 default
	private int field3;	// 접근제한자 private
	
	// 생성자
	public A() {
		field1 = 1;   
		field2 = 1;   
		field3 = 1;   
		
		// 메소드 호출
		method1();   
		method2();   
		method3();   
	}
	
	// 메소드(접근제한자는 public)
	public void method1() {}
	
	// 메소드(접근제한자는 default)
	void method2() {}
	
	// 메소드(접근제한자는 private)
	private void method3() {}
}
