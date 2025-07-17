package sec01.exam03;

public interface RemoteControl {
	
	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 접근제한자를 붙이지 않으면 매소드는 자동으로 추상 메소드가 됨
	void turnOn();	// public abstract void turnOn(); 와 같음
	void turnOff();	// public abstract void turnOff(); 와 같음
	void setVolume(int volume); // public abstract void setVolume(int volume); 와 같음
}
