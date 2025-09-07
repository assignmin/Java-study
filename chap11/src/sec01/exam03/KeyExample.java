package sec01.exam03;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별키 "new Key(1)" 로 "홍길동"을 저장함
		// 이때, 같은 식별 키를 가지고 있는지 hashCode() 메서드와 equals() 메서드로 확인
		hashMap.put(new Key(1), "홍길동");
		
		// 식별키 "new Key(1)" 로 "홍길동"을 읽어옴
		// Key 클래스에서 hashCode()와 equals()가 올바르게 재정의되어 있어야 같은 키로 인식됨
		String value  = hashMap.get(new Key(1));
		System.out.println(value);
	}
}


