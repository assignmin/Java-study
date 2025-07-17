package sec02.exam10;

public class  ContinueExample {
	public static void main(String[] args) throws Exception {
		
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {	//i가 2로 나눠떨어지지 않으면
				continue;	//아래 코드는 건너뛰고 다음 반복으로 이동(ex: i = 1 이면 i값에 1을 더해서 다음 반복문 실행)
			}
			System.out.println(i);
		}
	}
}


