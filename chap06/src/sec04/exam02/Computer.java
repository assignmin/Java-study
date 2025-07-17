package sec04.exam02;

public class Computer {
	
	// 배열의 합계를 구하는 메소드 선언
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// 배열을 직접 입력받지 않고도 여러개의 값을 편하게 받기위해 가변인자 사용한 메소드 선언(가변인자는 항상 매개변수의 마지막 순서에 위치해야 함)
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
