package sec02.verify.exam03;

public class Exam03 {
	public static void main(String[] args) {
		
		while (true) {	//while 반복문 무한 반복
			int num1 = (int) (Math.random() * 6) + 1;	//1부터 6 사이의 난수 하나 반환
			int num2 = (int) (Math.random() * 6) + 1;	//1부터 6 사이의 난수 하나 반환
			System.out.println("(" + num1 + ", " + num2 + ")");
			if ((num1 + num2) == 5) {	//두 난수를 더한 값이 5이면
				break;	//반복문 종료
			}
		}
	}
}
