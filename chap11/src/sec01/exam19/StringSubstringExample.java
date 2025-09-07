package sec01.exam19;

public class StringSubstringExample {
	public static void main(String[] args) {	
		
		String ssn = "880815-1234567 ";
		
		// 0번 인덱스부터 5번 인덱스까지의 문자를 추출하여 새로운 String 객체로 반환(인자로 준 끝 인덱스는 포함 x)
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);		
		
		// 7번 인덱스부터 문자열의 끝까지의 문자를 추출하여 새로운 String 객체로 반환
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	} 
}

