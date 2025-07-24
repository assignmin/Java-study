package sec02.exam01;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		// try 블록 실행 : 예외가 발생할 수 있는 코드 실행
		try {
			// String2 라는 이름의 클래스를 찾아 해당 클래스의 메타정보(Class 객체)를 Class 타입 변수에 대입
			// 해당 이름의 클래스가 존재하지 않으면 ClassNotFoundException 예외 발생
			Class clazz = Class.forName("String2");
		}
		catch(ClassNotFoundException e) {	// 클래스가 존재하지 않을 경우
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}

