package sec01.exam01;

public class StudentExample {
	public static void main(String[] args) {
		
		Student s1 = new Student();	// 클래스 객체 생성 후 대입
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();	// 클래스 객체 생성 후 대입(s1과 s2의 주소값은 다름)
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}

