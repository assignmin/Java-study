package sec01.verify.exam08;

public class IntegerCompareExample {
	public static void main(String[] args) {
		
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		// -128부터 127 범위까지는 같은 Integer 객체, 범위를 초과하면 각각 새로운 Integer 객체(equals()는 상관 x)
		System.out.println( obj1 == obj2 );
		System.out.println( obj3 == obj4 );
	}
}
