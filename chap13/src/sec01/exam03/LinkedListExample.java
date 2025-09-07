package sec01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		
		// String 타입을 요소로 갖는 ArrayList와 LinkedList 인스턴스 생성 후, List 타입 변수에 대입
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// 요소 추가하는 수행시간 측정 (아래 방식대로 수행시, ArrayList는 계속해서 요소들의 위치를 뒤로 조정해야 돼서 수행시간이 상대적으로 긺)
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++)
		{
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		
		// 요소 추가하는 수행시간 측정 (아래 방식대로 수행시, LinkedList는 새로 생기는 요소에 대해 노드만 연결하면 돼서 수행시간이 상대적으로 짧음)
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++)
		{
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
	}
}



