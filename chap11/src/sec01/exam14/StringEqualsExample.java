package sec01.exam14;

public class StringEqualsExample {
	public static void main(String[] args) {
		
		// "신민철" 을 새로운 객체로 생성
		String strVar1 = new String("신민철");
		// 문자열 리터럴로 변수 선언
		String strVar2 = "신민철";

		// 같은 주소값을 참조하는지 확인
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		}
		else {
			System.out.println("다른 String 객체를 참조");
		}
		
		// 문자열의 내용이 같은지 확인
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		}
		else {
			System.out.println("다른 문자열을 가짐");
		}
	}
}