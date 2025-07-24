package sec01.exam01;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		
		String data = null;
		// data가 null 이므로 toString() 메서드는 NullPointerException(런타임 에러) 발생
		System.out.println(data.toString());
	}
}

