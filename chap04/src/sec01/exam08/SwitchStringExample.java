package sec01.exam08;

public class SwitchStringExample {
	public static void main(String[] args) {
		
		String position = "과장";
		
		switch(position) {	//switch문의 피연산자로 String 타입 변수 position 대입
			case "부장":	//내부적으로 피연산자와 equals() 메소드로 비교
				System.out.println("700만원");
				break;
			case "과장":	//내부적으로 피연산자와 equals() 메소드로 비교
				System.out.println("500만원");
				break;							
			default:	//그 외의 경우
				System.out.println("300만원");
		}
	}
}

