package sec01.exam18;

public class StringReplaceExample {
	public static void main(String[] args) {
		
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		
		// 문자열에서 "자바"를 모두 "JAVA"로 변경한 새로운 String 객체를 반환
		// String 객체는 불변(immutable) 객체이기 때문에, 기존 문자열은 변경되지 않고 새로운 String 객체가 반환됨
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}

