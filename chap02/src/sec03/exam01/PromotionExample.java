package sec03.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;	//byte 타입이 int 타입으로 자동 타입 변환
		System.out.println("intValue: " + intValue);

		char charValue = '가';
		intValue = charValue;	//char 타입이 int 타입으로 자동 타입 변환
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;	//int 타입이 long 타입으로 자동 타입 변환
		System.out.println("longValue: " + longValue);	
		
		longValue = 100;
		float floatValue = longValue;	//long 타입이 float 타입으로 자동 타입 변환
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;	//float 타입이 double 타입으로 자동 타입 변환
		System.out.println("doubleValue: " + doubleValue);
	} 
}

