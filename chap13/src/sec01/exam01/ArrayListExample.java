package sec01.exam01;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		
		// String 타입을 요소로 갖는 ArrayList 인스턴스를 생성 후, List 타입 변수에 대입
		List<String> list = new ArrayList<String>();
		
		// 요소 추가
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		// 인덱스 2 위치에 삽입 (기존의 2 위치에 있던 요소는 뒤로 밀림)
		list.add(2, "Database");
		list.add("iBATIS");

		// 요소의 개수
		int size = list.size();
		System.out.println("총 객체수: " + size);		
		System.out.println();
		
		// 인덱스 2 위치의 요소 반환
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		// 모든 요소 출력
		for(int i = 0; i < list.size(); i++)
		{
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
				
		// 인덱스 2 위치의 요소 제거 (제거 후, 뒤쪽의 요소들이 앞으로 위치가 조정)
		list.remove(2);
		// 인덱스 2 위치의 요소 제거 (제거 후, 뒤쪽의 요소들이 앞으로 위치가 조정)
		list.remove(2);
		// "iBATIS" 요소를 제거
		list.remove("iBATIS");		
		
		// 모든 요소 출력
		for(int i = 0; i < list.size(); i++)
		{
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}

