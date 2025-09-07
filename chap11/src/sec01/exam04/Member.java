package sec01.exam04;

public class Member {
	
	public String id;

	public Member(String id) {
		this.id = id;
	}

	// equals() 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Member) {	// obj가 Member 객체 일때
			
			Member member = (Member) obj;
			
			// String 클래스의 equals() 메서드는 문자열 내용이 같으면 true 를 반환하도록 재정의 됨
			if (id.equals(member.id)) {
				return true;
			}
		}
		
		return false;
	}

	// hashCode() 메서드 재정의
	// 기본적으로 hashCode()는 객체의 참조(주소)를 기반으로, JVM이 생성한 정수 해시값 반환(메모리 주소 간접적으로 활용)
	@Override
	public int hashCode() {
		
		// String 클래스의 hashCode()는 재정의 되어있어서, 같은 문자열 내용을 가지면 같은 해시값을 가짐
		return id.hashCode();
	}
}
