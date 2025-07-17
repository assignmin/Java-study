package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {

		// Child 객체 생성
		Child child = new Child();

		// 부모타입으로 캐스팅
		Parent parent = child;

		// 부모타입에서 선언한 메소드 실행
		parent.method1();

		// 부모타입에서 선언하고 자식타입에서 재정의한 메소드 실행(재정의한 메소드가 실행), 동적바인딩
		  parent.method2();

		  //parent.method3();  부모타입으로 업캐스팅 했으므로 자식타입에서 선언한 메소드는 사용 불가
	}
}
