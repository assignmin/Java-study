package sec04.exam04;

public class Calculator {
	
	// 필드
	
	// 생성자
	
	// 덧셈을 수행하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 평균을 구하는 메소드 선언
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	// 실행하는 메소드 선언
	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	// 문자열을 출력하는 메소드 선언
	void println(String message) {
		System.out.println(message);
	}	
}

