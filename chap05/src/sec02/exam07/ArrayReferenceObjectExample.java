package sec02.exam07;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {		
		
		String[] strArray = new String[3];	//String 타입 3칸 배열 생성(요소는 모두 null)
		strArray[0] = "Java";	//리터럴 대입
		strArray[1] = "Java";	//리터럴 대입
		strArray[2] = new String("Java");	//객체 생성 후 대입

		System.out.println( strArray[0] == strArray[1]);	//true(같은 주소값을 가짐)
		System.out.println( strArray[0] == strArray[2] );   //false(다른 주소값을 가짐)
		System.out.println( strArray[0].equals(strArray[2]) );	//true(같은 문자열을 가짐)
	} 
}

