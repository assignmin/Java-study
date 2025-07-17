package sec02.exam05;

public class ImplementationC implements InterfaceC {
	
	// InterfaceC에서 상속받은 InterfaceA와 InterfaceB의 추상 메소드까지 모두 구현(오버라이딩)
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}	
	
	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}
	
	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}

