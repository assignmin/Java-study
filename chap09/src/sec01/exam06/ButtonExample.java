package sec01.exam06;

public class ButtonExample {
	public static void main(String[] args) {
		
		// Button 객체 생성
		Button btn = new Button();
		
		// 인자로 CallListener 객체 넘김
		btn.setOnClickListener(new CallListener());
		btn.touch();	// CallListener 객체의 메서드 실행(다형성)
		
		// 인자로 MessageListener 객체 넘김
		btn.setOnClickListener(new MessageListener());
		btn.touch();	// MessageListener 객체의 메서드 실행(다형성)
	}
}
