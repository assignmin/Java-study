package sec01.verify.exam04;

public class MemberExample {
	public static void main(String[] args) {
		
		// Member 객체 생성
		Member member = new Member("blue", "이파란");
		// 내부적으로 member.toString() 출력
		System.out.println(member);
	}
}
