package sec01.exam05;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		
		// Member 타입을 요소로 갖는 HashSet 인스턴스 생성 후, Set 타입 변수에 대입
		Set<Member> set = new HashSet<Member>();
		
		// 같은 인자를 갖는 Member 인스턴스 생성 후, 요소 추가
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		// 요소 수 출력 (equals()와 hashCode()를 재정의 해서 같은 요소를 추가한 것으로 인지해서 무시)
		System.out.println("총 객체수 : " + set.size());
	}
}

