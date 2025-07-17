package sec03.verify.exam04;

public class BoardExample {
	public static void main(String[] args) {
		
		Board board1 = new Board("제목", "내용");	// 매개변수를 2개 받는 생성자 호출
		Board board2 = new Board("제목", "내용", "홍길동");	// 매개변수를 3개 받는 생성자 호출
		Board board3 = new Board("제목", "내용", "홍길동", "2025-12-31");	// 매개변수를 4개 받는 생성자 호출
		Board board4 = new Board("제목", "내용", "홍길동", "2025-12-31", 0);	// 매개변수를 5개 받는 생성자 호출
	}
}
