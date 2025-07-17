package sec04.exam03;

public class ContinueKeyCodeReadExample {
	public static void main(String[] args) throws Exception {
		
		int keyCode;

		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode); // 반복문을 톨며, 버퍼에 있는 바이트와 13(\r), 10(\n)을 모두 출력
		}
	}
}

