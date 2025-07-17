package sec03.exam03;

public class ByteOperationExample {
	public static void main(String[] args) {
		
		byte result1 = 10 + 20;	//정수형 리터럴끼리의 연산 결과를 byte 타입에 대입(컴파일 타임에 자동으로 타입 변환)
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;	//byte 타입(+ short, char)은 연산자를 만나면, int 타입으로 타입 변환
		System.out.println(result2);
	}
}

