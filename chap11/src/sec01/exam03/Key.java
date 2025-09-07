package sec01.exam03;

public class Key {
	
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	// equals() 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Key) {	// obj가 Key 객체인지 확인
			
			Key compareKey = (Key) obj;
			
			if(this.number == compareKey.number) {
				return true;
			}
		} 
		
		return false;
	}
	
	// hashCode() 메서드 재정의
	// 기본적으로 hashCode()는 객체의 참조(주소)를 기반으로, JVM이 생성한 정수 해시값 반환(메모리 주소 간접적으로 활용)
	@Override
	public int hashCode() {
		return number;
	}
}

