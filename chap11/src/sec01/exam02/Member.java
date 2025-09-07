package sec01.exam02;

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// equals() 메서드 재정의(기본적으로 클래스의 equals() 메서드는 참조 객체의 번지 비교)
	@Override
	public boolean equals(Object obj) {	// 매개변수는 Object 객체
		
		if(obj instanceof Member) {	// obj가 Member 객체인 경우
			
			Member member = (Member) obj;
			
			if(id.equals(member.id)) {	// 문자열 id가 같은지 확인
				return true;
			}
		}
		
		return false;
	}
}
