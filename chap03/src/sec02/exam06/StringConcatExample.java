package sec02.exam06;

public class StringConcatExample {
	public static void main(String[] args) {
		
		String str1 = "JDK" + 6.0;	//문자열 + 숫자 결합 -> 문자열("JDK6.0")
		String str2 = str1 + " 특징";	//"JDK6.0 특징"
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;	//"JDK33.0"
		String str4 = 3 + 3.0 + "JDK";	//"6.0JDK"
		System.out.println(str3);
		System.out.println(str4);		
	}
}