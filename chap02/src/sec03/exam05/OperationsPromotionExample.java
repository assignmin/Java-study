package sec03.exam05;

public class OperationsPromotionExample {
	public static void main(String[] args) {	
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;   //컴파일 에러 발생(byte 타입끼리의 연산이므로 연산의 결과는 int 타입)
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;   //컴파일 에러 발생(char 타입끼리의 연산이므로 연산의 결과는 int 타입)
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);	//정수 출력
		System.out.println("출력문자=" + (char)intValue2);	//강제 타입 변환을 하여 char 타입으로 출력 가능
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;	//int 타입의 연산이므로 연산의 결과는 int 타입
		System.out.println(intValue4);	//정수 출력
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;   //컴파일 에러 발생(연산에 double 타입 리터럴이 있으므로 연산의 결과는 double 타입)
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);	//실수 출력
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;	//강제 타입 변환을 통해 연산에 double 타입이 있으므로 연산의 결과는 double 타입
		System.out.println(result);
	} 
}

