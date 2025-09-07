package sec01.verify.exam07;

public class FindAndReplaceExample {
	public static void main(String[] args) {
		
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		
		// "자바" 문자열이 위치한 인덱스 반환
		int index = str.indexOf("자바");
		
		// "자바" 문자열이 포함되지 않은 경우
		if(index == -1)
		{
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		}
		else
		{
			
			System.out.println("자바 문자열이 포함되어 있습니다.");
			// "자바" 를 "Java" 로 변환한 새로운 String 객체를 반환
			str = str.replace("자바", "Java");
			System.out.println("-->" + str);
		}
	}
}
