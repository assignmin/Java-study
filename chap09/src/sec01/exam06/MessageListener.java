package sec01.exam06;

public class MessageListener implements Button.OnClickListener {
	
	@Override
	// 추상 메서드 재정의
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}
