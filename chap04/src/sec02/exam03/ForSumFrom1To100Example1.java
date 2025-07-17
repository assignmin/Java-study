package sec02.exam03;

public class ForSumFrom1To100Example1 {
	public static void main(String[] args) {
		
		int sum = 0; 
		
		int i = 0;	//i를 외부에서 선언
		for(i=1; i<=100; i++) {	//for 반복문(i는 1부터 100일때 까지 i 값을 1씩 증가시키며 반복문 실행)
			sum += i;	//sum에 i값 추가
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);	//i는 101이 되고나서 반복문이 끝나므로 i값은 101
	}
}

