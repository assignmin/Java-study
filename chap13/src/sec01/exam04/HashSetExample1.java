package sec01.exam04;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		
		// String 타입을 요소로 갖는 HashSet 인스턴스 생성 후, Set 타입 변수에 대입
		Set<String> set = new HashSet<String>();
		
		// 요소 추가
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		// 요소 수
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// hashSet에서 요소를 하나씩 꺼내기 위해 Iterator 객체를 반환받음
		Iterator<String> iterator = set.iterator();
		// iterator에 요소가 있을때까지 반복
		while(iterator.hasNext())
		{
			// 요소를 하나 꺼냄 (순서 보장 x)
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		// 요소 삭제
		set.remove("JDBC");
		set.remove("iBATIS");
		
		// 요소 수
		System.out.println("총 객체수: " + set.size());
		
		// set에서 요소를 하나씩 가져와서 element에 대입 후 반복(요소 수 만큼 반복)
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		// set의 요소를 전부 삭제
		set.clear();		
		// set이 비어있을 때
		if(set.isEmpty())
		{
			System.out.println("비어 있음");
		}
	}
}

