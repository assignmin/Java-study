package sec06.exam04.package1;

public class A {
	
	// 필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	//생성자(접근제한자는 public)
	public A(boolean b) {}
	
	//생성자(접근제한자는 default)
	A(int b) {}
	
	//생성자(접근제한자는 private)
	private A(String s) {} 
}

