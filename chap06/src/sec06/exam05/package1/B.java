package sec06.exam05.package1;

public class B {
	
	// 생성자
	public B() {
		A a = new A();
		a.field1 = 1;   
		a.field2 = 1;   
		//a.field3 = 1;	// 핃드의 접근제한자가 private 이므로 다른 클래스에서 선언 불가 
		
		a.method1();  
		a.method2();  
		//a.method3();	// 메소드의 접근제한자가 private 이므로 다른 클래스에서 선언 불가
	}
}

