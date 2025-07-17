package sec01.exam05;

public class SmartTelevision implements RemoteControl, Searchable {	// 2개의 인터페이스 구현
	
	// 필드
	private int volume;
	
	// turnOn 추상 메소드 구현(오버라이딩)
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	// turnOff 추상 메소드 구현(오버라이딩)
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	// setVolume 추상 메소드 구현(오버라이딩)
	@Override
	public void setVolume(int volume) {
		
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	// search 추상 메소드 구현(오버라이딩)
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
