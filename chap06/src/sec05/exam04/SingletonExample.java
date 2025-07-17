package sec05.exam04;

public class SingletonExample {
	public static void main(String[] args) {
		
		/*
		Singleton obj1 = new Singleton();  // 컴파일 에러(생성자가 private 이므로 클래스 외부에서는 호출 불가)
		Singleton obj2 = new Singleton();  // 컴파일 에러(생성자가 private 이므로 클래스 외부에서는 호출 불가)
		*/
		
		Singleton obj1 = Singleton.getInstance();	// 객체 받기
		Singleton obj2 = Singleton.getInstance();	// 객체 받기
		
		// 생성되어 있는 Singleton 객체는 하나뿐 이므로 같은 주소값을 가짐
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
