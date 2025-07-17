package sec03.exam02;

public abstract class Animal {
	
	// 필드
	public String kind;
	
	// 생성자
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	// 추상 메소드(추상메소드를 가진 클래스는 무조건 추상 클래스가 됨, 클래스에도 abstract 키워드를 붙여야함)
	public abstract void sound();
}

