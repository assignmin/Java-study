package sec01.exam06;

public class Button {
	
	// 인터페이스 타입 변수 선언
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// 정적 인터페이스 선언
	static interface OnClickListener {
		
		// 추상 메서드
		void onClick();
	}
}
