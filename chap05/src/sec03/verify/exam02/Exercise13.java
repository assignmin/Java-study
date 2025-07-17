package sec03.verify.exam02;

public class Exercise13 {
	public static void main(String[] args) {
		
		LoginResult result = LoginResult.FAIL_PASSWORD;	//열거 타입 변수 선언 후 열거 상수 대입
		if(result == LoginResult.SUCCESS) {	//주소값 비교
			System.out.println("로그인 성공");
		} else if(result == LoginResult.FAIL_ID) {	//주소값 비교
			System.out.println("아이디가 존재하지 않음");
		} else if(result == LoginResult.FAIL_PASSWORD) {	//주소값 비교
			System.out.println("비밀번호가 틀림");
		}
	}
}


