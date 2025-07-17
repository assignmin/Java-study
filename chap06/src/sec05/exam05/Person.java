package sec05.exam05;

public class Person {
	
	// final 키워드로 필드 선언(한번 값이 할당되면 변경 불가)
	final String nation = "Korea";
	final String ssn;
	String name;
	
	// 생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;	// 필드에 값 대입
		this.name = name;	// 필드에 값 대입
	}
}

