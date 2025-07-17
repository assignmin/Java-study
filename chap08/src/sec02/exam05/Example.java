package sec02.exam05;

public class Example {
	public static void main(String[] args) {
		
		// ImplementationC 객체 생성
		ImplementationC impl = new ImplementationC();
		
		// 업캐스팅
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		// 업캐스팅
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		// 업캐스팅
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}

