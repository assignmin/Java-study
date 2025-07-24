package sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		
		// 현재 args는 매개값 없으므로 ArrayIndexOutOfBoundsException(런타임 에러) 발생
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}
}

