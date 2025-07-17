package sec02.exam02;

public class FieldInitValueExample {
	public static void main(String[] args) {	
		
		FieldInitValue fiv = new FieldInitValue();	// FieldInitValue 클래스 객체 생성 후 대입 
		
		// 필드값 출력
		System.out.println("byteField: " + fiv.byteField);
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);		
		System.out.println("booleanField: " + fiv.booleanField);
		System.out.println("charField: " + fiv.charField);		
		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);		
		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
	}
}
