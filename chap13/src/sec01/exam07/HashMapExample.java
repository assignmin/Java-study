package sec01.exam07;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		
		// Student 타입을 key로 갖고, Integer 타입을 value로 갖는 HashMap 인스턴스 생성 후, Map 타입 변수에 대입
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// Student의 인자를 같은 값을 넣어서 인스턴스 생성 후, map에 추가 (같은 key값은 그냥 덮어쓰기)
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		System.out.println("총 Entry 수: " + map.size());
	}
}

