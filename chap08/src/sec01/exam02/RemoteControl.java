package sec01.exam02;

public interface RemoteControl {	// 인터페이스 선언(인터페이스에서 필드는 자동으로 상수가 됨)
	int MAX_VOLUME = 10;	// public static final int MAX_VOLUME = 10; 와 같음(값은 반드시 선언하면서 대입해야 함)
	int MIN_VOLUME = 0;		// public ststuc final int MIN_VOLUME = 0; 와 같음(값은 반드시 선언하면서 대입해야 함)
}
