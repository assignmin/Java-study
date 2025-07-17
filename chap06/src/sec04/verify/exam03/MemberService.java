package sec04.verify.exam03;

public class MemberService {
	
	// 로그인하는 메소드 선언
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	// 로그아웃하는 메소드 선언
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
