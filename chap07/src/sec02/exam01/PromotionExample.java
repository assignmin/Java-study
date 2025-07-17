package sec02.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		
		// 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();		
		
		// 부모타입으로 업캐스팅
		A a1 = b;
		A a2 = c;
		A a3 = d;	// A 클래스를 상속받은 B 클래스를 상속받은 D 클래스
		A a4 = e;	// A 클래스를 상속받은 C 클래스를 상속받은 E 클래스
		
		B b1 = d;
		C c1 = e;

		//B b3 = e;	// B 클래스는 상속관계에서 E 클래스의 부모클래스가 아니어서 캐스팅 불가
		//C c2 = d;	// C 클래스는 상속관계에서 D 클래스의 부모클래스가 아니어서 캐스팅 불가
	}
}

