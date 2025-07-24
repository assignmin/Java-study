package sec01.exam06;

public class CallListener implements Button.OnClickListener {
	
	@Override
	// 추상 메서드 재정의
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}
