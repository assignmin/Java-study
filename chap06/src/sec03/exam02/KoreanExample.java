package sec03.exam02;

public class KoreanExample {
	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바", "011225-1234567");	// Korean 클래스 생성자를 호출하여, 객체 생성
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "930525-0654321");	// Korean 클래스 생성자를 호출하여, 객체 생성
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}

