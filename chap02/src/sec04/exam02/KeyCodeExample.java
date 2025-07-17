package sec04.exam02;

public class KeyCodeExample {
	public static void main(String[] args) throws Exception {
		
		int keyCode;

		keyCode = System.in.read();	//첫번째 바이트만 읽음
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();	//13(\r)
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();	//10(\n)
		System.out.println("keyCode: " + keyCode);
	}	//버퍼의 '입력된 바이트' + 13 + 10 이 순차적으로 하나씩 대입
}

