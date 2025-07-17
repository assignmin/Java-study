package sec03.exam02;

public class CastingExample {
	public static void main(String[] args) {	
		
		int intValue = 44032;
		char charValue = (char) intValue;	//명시적으로 강제 타입 변환
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	
	} 
}

