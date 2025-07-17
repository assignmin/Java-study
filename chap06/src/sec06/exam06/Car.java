package sec06.exam06;

public class Car {
	
	// 필드
	private int speed;	// 접근제한자는 private
	private boolean stop;	// 접근제한자는 private
	
	// 생성자
	
	// 메소드(속도 확인)
	public int getSpeed() {
		return speed;
	}
	
	// 메소드(속도 설정)
	public void setSpeed(int speed) {
		if(speed < 0) { 
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	// 메소드(멈춤)
	public boolean isStop() {
		return stop;
	}
	
	// 메소드(멈춤 설정)
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
