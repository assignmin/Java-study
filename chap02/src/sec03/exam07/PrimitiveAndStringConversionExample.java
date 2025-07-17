package sec03.exam07;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		
		int value1 = Integer.parseInt("10"); //정수로 변환
		double value2 = Double.parseDouble("3.14");	//실수로 변환
		boolean value3 = Boolean.parseBoolean("true");	//true로 변환
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10);	//문자열 "10"으로 변환
		String str2 = String.valueOf(3.14);	//문자열 "3.14"로 변환
		String str3 = String.valueOf(true);	//문자열 "true"로 변환
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}
}

