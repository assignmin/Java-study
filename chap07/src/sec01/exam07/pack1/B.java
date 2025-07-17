package sec01.exam07.pack1;

public class B {
	
	public void method() {
		
		// A 객체 생성(생성자의 접근제한자가 protected이고 같은 패키지에 있으므로 가능)
		A a = new A();
		
		// 필드 값 변경(필드의 접근제한자가 protected이고 같은 패키지에 있으므로 가능)
		a.field = "value";
		
		// 메소드 호출(메소드의 접근제한자가 protected이고 같은 패키지에 있으므로 가능)
		a.method();
	}
}
