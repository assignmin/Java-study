package sec01.exam05;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		
		// SmartTelevision 객체 생성
		SmartTelevision tv = new SmartTelevision();
		
		// 인터페이스 타입 변수에 구현 클래스 대입
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(10);
		
		// 인터페이스 타입 변수에 구현 클래스 대입
		Searchable searchable = tv;
		searchable.search("http://www.google.com");
	}
}
