package sec04.exam03;

public class Car {
	
	// 필드
	int gas;
	
	// 생성자
	
	// 가스의 값을 설정하는 메소드 선언
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// 가스가 남아있는지 확인하는 메소드 선언
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다."); 
			return false;
		}
		System.out.println("gas가 있습니다."); 
		return true;
	}
	
	// 차를 운행하는 메소드 선언
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return;
			}
		}
	}
}

