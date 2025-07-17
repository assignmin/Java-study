package sec02.exam06;

public class InstanceofExample {
	
	// 메소드(매개변수를 Parent 타입으로 받은 후, instanceof 연산자를 통해 객체가 Child 타입으로 생성되었는지 확인. 맞다면, 다운캐스팅 수행)
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;	// 다운 캐스팅
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	// 메소드(매개변수를 Parent 타입으로 받은 후, 객체의 타입 확인없이 바로 다운캐스팅 수행)
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	// 메인 메소드
	public static void main(String[] args) {
		
		// Child 타입 객체 생성 후, Parent 타입 변수에 대입
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		// Parent 타입 객체 생성 후, Parent 타입 변수에 대입
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); //예외 발생(객체가 Child 타입으로 생성되지 않았지만, 메소드 내부에서 다운캐스팅을 시도함)
	}
}
