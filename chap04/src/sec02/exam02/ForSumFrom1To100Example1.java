package sec02.exam02;

public class ForSumFrom1To100Example1 {
	public static void main(String[] args) {
		
		int sum = 0; 
		
		for(int i=1; i<=100; i++) {	//for 반복문(i를 선언하고 i는 1부터 100일때 까지 i 값을 1씩 증가시키며 반복문 실행)
			sum += i;	//sum에 i 값을 추가
		}
		
		System.out.println("1~100 합 : " + sum);
	}
}

