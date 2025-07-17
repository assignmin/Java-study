package sec02.verify.exam02;

public class Exam02 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {	//for 반복문(i는 1부터 100일때까지 i값을 1씩 증가하며 반복문 실행)
			if (i % 3 == 0) {	//i가 3으로 나눠 떨어지면
				sum += i;	//sum에 i값 추가
			}
		}
		System.out.println("3의 배수의 합: " + sum);
	}
}
