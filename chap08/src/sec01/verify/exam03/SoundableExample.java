package sec01.verify.exam03;

public class SoundableExample {
	
	// 메소드(매개변수는 인터페이스 타입)
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	// main 메소드
	public static void main(String[] args) {
		
		// 인자로 인터페이스를 구현한 클래스를 넘겨서 메소드 호출
		printSound(new Cat());
		printSound(new Dog());
	}
}
