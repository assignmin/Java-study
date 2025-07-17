package sec01.exam02;

public class Student extends People{	// People 클래스 상속
	
	// 필드
	public int studentNo;
	
	// 생성자(부모클래스에 기본생성자 없음)
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	// 부모클래스의 생성자 호출
		this.studentNo = studentNo;
	}
}

