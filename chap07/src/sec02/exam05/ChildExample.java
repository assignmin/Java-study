package sec02.exam05;

public class ChildExample {
	public static void main(String[] args) {
		
		// Child 객체 생성 후 Parent 타입 변수에 대입(업캐스팅)
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.field2 = "data2";  // 자식 클래스인 Child 클래스에서 새로 선언한 필드 사용 불가
		parent.method3();         // 자식 클래스인 Child 클래스에서 새로 선언한 메소드 호출 불가
		*/
		
		Child child = (Child) parent;	// 부모 타입으로 캐스팅 된 객체를 다시 자식 타입으로 캐스팅(다운캐스팅), 다운캐스팅은 자식 타입에서 부모 타입으로 바꾼후에 다시 자식 타입으로 바꿀때만 사용 가능
		child.field2 = "yyy";  // 사용 가능
		child.method3();     // 호출 가능
	}
}
