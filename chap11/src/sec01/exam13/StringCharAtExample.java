package sec01.exam13;

public class StringCharAtExample {
	public static void main(String[] args) {
		
		String ssn = "010624-1230123";
		// 7번 인덱스에 위치한 글자 반환
		char sex = ssn.charAt(7);
		// 케이스 분류
		switch (sex) {
			// 1이나 3인 경우
			case '1':
			case '3':
				System.out.println("남자 입니다.");
				break;
			// 2나 4인 경우
			case '2':
			case '4':
				System.out.println("여자 입니다.");
				break;
		}
	}
}

