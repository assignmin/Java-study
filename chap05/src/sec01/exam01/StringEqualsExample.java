package sec01.exam01;

public class StringEqualsExample {
	public static void main(String[] args) {	
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {	//객체의 주소값 비교(둘은 모두 같은 리터럴을 대입해서, 같은 주소를 갖고 있음)
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {	//객체의 문자열 내용 비교
			System.out.println("strVar1과 strVar2는 문자열이  같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {	//객체의 주소값 비교(둘은 각각 새로운 객체를 생성하였으므로, 다른 주소를 갖고 있음)
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {	//객체의 문자열 내용 비교
			System.out.println("strVar3과 strVar4는 문자열이  같음");
		}		
	} 
}
