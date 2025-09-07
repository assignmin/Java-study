package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		
		// String 타입을 key로 갖고, Integer 타입을 value로 갖는 HashMap 인스턴스 생성 후, Map 타입 변수에 대입
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 요소 추가
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);	// key가 같으면, value를 덮어씌움 (Map 특징)
		System.out.println("총 Entry 수: " + map.size());
		
		// 요소의 값 찾기		
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 요소의 key를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext())
		{
		  String key = keyIterator.next();
		  Integer value = map.get(key);
		  System.out.println("\t" + key + " : " + value);
		}		
		System.out.println();	
		
		// 요소 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
		// 요소를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext())
		{
		  Map.Entry<String, Integer> entry = entryIterator.next();
		  String key = entry.getKey();	// key 반환
		  Integer value = entry.getValue();	// value 반환
		  System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 요소 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}

