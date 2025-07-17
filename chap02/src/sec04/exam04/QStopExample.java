package sec04.exam04;

public class QStopExample {
	public static void main(String[] args) throws Exception {
		
		int keyCode;

		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {	//버퍼에 q가 존재 할 경우		       
				break;		//반복문 종료
			}
		}
		
		System.out.println("종료");
	}
}

