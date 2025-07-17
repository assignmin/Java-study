package sec05.exam04;

public class Singleton {
	
	// 클래스 내부에서만 사용가능한 정적 Singleton 객체 생성
	private static Singleton singleton = new Singleton();
	
	// 생성자는 private로 선언(외부에서 호출 불가)
	private Singleton() {}
	
	// 생성된 Singleton 객체를 반환하는 정적 메소드
	static Singleton getInstance() {
		return singleton;
	}
}

