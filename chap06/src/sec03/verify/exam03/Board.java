package sec03.verify.exam03;

public class Board {
	
	// 필드 선언
	String title;
	String content;
	String writer;
	String date;
	int hitcount;

	// 매개변수를 2개 받는 생성자 선언
	Board(String title, String content) {
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);	// 매개변수의 타입, 순서와 일치한 생성자를 찾아서 호출
	}

	// 매개변수를 3개 받는 생성자 선언
	Board(String title, String content, String writer) {
		this(title, content, writer, "현재 컴퓨터 날짜", 0);	// 매개변수의 타입, 순서와 일치한 생성자를 찾아서 호출
	}

	// 매개변수를 4개 받는 생성자 선언
	Board(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);	// 매개변수의 타입, 순서와 일치한 생성자를 찾아서 호출
	}

	// 매개변수를 5개 받는 생성자 선언
	Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}
