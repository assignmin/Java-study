package sec01.exam06;

public class MyClassExample {
	public static void main(String[] args) {
		
		System.out.println("1)----------------");
		
		// MyClass 객체 생성 
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)----------------");
		
		// 인터페이스 구현 클래스를 인자로 넘기며 MyClass 객체 생성
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)----------------");
		
		// MyClass 객체 생성
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)----------------");
		
		// MyClass 객체 생성
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}
