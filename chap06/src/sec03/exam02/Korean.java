package sec03.exam02;

public class Korean {
	
	// 필드
	String nation = "대한민국";
	String name;
	String ssn;

	// 매개변수로 2개의 String 타입을 받는 생성자 선언
	public Korean(String n, String s) {
	  name = n;
	  ssn = s;
	}
	
	/*public Korean(String name, String ssn) {	// 매개변수명이 다르더라도 매개변수의 타입과 개수가 같으므로 선언할 수 없음
	  this.name = name;
	  this.ssn = ssn;
	}*/
}

