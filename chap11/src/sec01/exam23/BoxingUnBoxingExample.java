package sec01.exam23;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		
		// Boxing의 경우 (Integer 타입으로 변환)
		// -128부터 127까지의 범위는 동일한 Integer 객체를 사용하여 메모리 효율성을 높임
		// 그 범위 외의 값은 새로운 Integer 객체를 생성함
		Integer obj1 = new Integer(100);	// 이 방식은 권장 x
		Integer obj2 = new Integer("200");	// 이 방식은 권장 x
		Integer obj3 = Integer.valueOf("300");
		
		// Unboxing의 경우 (Integer 객체를 다시 int 타입으로 변환)
		// Integer 객체에서 기본형 int 값으로 변환
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
