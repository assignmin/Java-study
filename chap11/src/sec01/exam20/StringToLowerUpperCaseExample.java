package sec01.exam20;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";		
		
		// 문자열 내용이 같은지 비교
		System.out.println(str1.equals(str2));
		
		// 문자열의 문자를 전부 소문자로 변경한 새로운 String 객체 반환
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		// 대소문자 구분없이 비교
		System.out.println(str1.equalsIgnoreCase(str2));				
	}
}

