package sec02.exam07;

public class WhileSumForm1To100Example {
	public static void main(String[] args) {
		
		int sum = 0; 
		int i = 1;
		
		while(i<=100) {	//while 반복문(i가 100일때까지 반복문 실행)
			sum += i;	//sum에 i값 추가
			i++;	//i값 1 증가
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);	//i는 101이 되고나서 반복문이 끝나므로 i값은 101
	}
}

