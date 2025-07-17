package sec01.exam04;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// RemoteControl 타입 변수 선언(인터페이스 자체로는 객체 생성 불가)
		RemoteControl rc;
		
		// Television 객체 생성 후 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		
		// Audio 객체 생성 후 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	}
}
