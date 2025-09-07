package sec01.exam16;

public class StringIndexOfExample {
	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		// "프로그래밍" 이 가장 먼저 나오는 위치의 시작 인덱스 반환(포함이 안될 경우 -1 반환)
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		// 문자열에 "자바" 가 있는지 확인
 		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		}
 		else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}
}

