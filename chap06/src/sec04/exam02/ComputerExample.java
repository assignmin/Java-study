package sec04.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		
		Computer myCom = new Computer();	// Computer 클래스 생성자를 호출하여 객체 생성
		
		int[] values1 = {1, 2, 3};	// 배열 생성
		int result1 = myCom.sum1(values1);	// 매개변수로 배열 대입
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});	// 매개변수로 배열을 생성하여 대입
		System.out.println("result2: " + result2);		
		
		int result3 = myCom.sum2(1, 2, 3);	// 매개변수로 여러 값을 대입
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);	// 매개변수로 여러 값을 대입
		System.out.println("result4: " + result4);
	}
}
