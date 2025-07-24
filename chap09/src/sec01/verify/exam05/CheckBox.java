package sec01.verify.exam05;

public class CheckBox {
	
	// 인터페이스 타입 변수 선언
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	// 정적 인터페이스 선언
	static interface OnSelectListener {
		
		// 추상 메서드
		void onSelect();
	}
}
