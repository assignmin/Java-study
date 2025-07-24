package sec02.exam03;

public class Window {
	
	// Button 객체 생성
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 익명 객체 생성
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		// 추상 메서드 재정의
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		// 인자로, 생성한 익명 객체를 넘김
		button1.setOnClickListener(listener);
		
		// 인자로, 새로 익명 객체를 생성해서 넘김
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			// 추상 메서드 재정의
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
