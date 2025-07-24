package sec02.exam04;

public class Anonymous {
	
	private int field;
	
	public void method(final int arg1, int arg2) {
		
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 = 20; (x)
		//arg2 = 20; (x), 익명객체에서 사용하고 있으므로 effectively final
		
		//var1 = 30; (x)
		//var2 = 30; (x), 익명객체에서 사용하고 있으므로 effectively final
		
		// 익명 객체 생성
		Calculatable calc = new Calculatable() {
			
			@Override
			// 추상 메서드 재정의
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;	// 외부 클래스의 필드는 상관없음
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}











