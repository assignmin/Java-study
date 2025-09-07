package sec01.exam02;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		// Board 타입을 요소로 갖는 Vector 인스턴스 생성 후, List 타입 변수에 대입
		List<Board> list = new Vector<Board>();
	
		// 요소 추가
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		// 인덱스 2 위치의 요소 삭제 (삭제 후, 뒤쪽의 요소들은 앞쪽으로 위치 조정)
		list.remove(2);
		// 인덱스 3 위치의 요소 삭제 (삭제 후, 뒤쪽의 요소들은 앞쪽으로 위치 조정)
		list.remove(3);
		
		// 모든 요소 출력
		for(int i = 0; i < list.size(); i++)
		{
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}

