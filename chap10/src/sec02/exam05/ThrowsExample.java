package sec02.exam05;

public class ThrowsExample {
	public static void main(String[] args) {
		
		// try 블록 실행 : 예외가 발생할 수 있는 코드 실행
		try {
			findClass();
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	// 메서드 실행 시 발생되는 ClassNotFoundException 예외를 호출한 블록에 넘김(호출하는 블록에서 예외 처리)
	public static void findClass() throws ClassNotFoundException {
		
		// java.lang.String2 라는 이름의 클래스를 찾아 해당 클래스의 메타정보(Class 객체)를 Class 타입 변수에 대입
		Class clazz = Class.forName("java.lang.String2");
	}
}

