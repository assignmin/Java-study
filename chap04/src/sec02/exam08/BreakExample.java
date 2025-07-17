package sec02.exam08;

public class  BreakExample {
	public static void main(String[] args) throws Exception {
		
		while(true) {	//while 반복문 무한 반복
			int num = (int)(Math.random()*6) + 1;	//1부터 6사이의 난수 하나 반환
			System.out.println(num);
			if(num == 6) {	//만약 num이 6이면
				break;	//반복문 종료
			}
		}
		System.out.println("프로그램 종료");
	}
}


