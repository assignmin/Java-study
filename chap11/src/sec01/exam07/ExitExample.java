package sec01.exam07;


public class ExitExample {
	public static void main(String[] args)  {
		
		for(int i=0; i<10; i++) {
			if(i == 5) {
				
				// 현재 JVM을 종료, 프로그램 즉시 종료(이후의 코드 실행 x)
				System.exit(i);
				//break;
			}
		}
		System.out.println("마무리 코드");
	}
}

