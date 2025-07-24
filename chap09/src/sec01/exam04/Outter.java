package sec01.exam04;

public class Outter {
	
	// 자바7 이전 : 지역 변수나 매개변수를 내부 클래스에서 사용하려면 반드시 final 키워드를 명시해야 함
	public void method1(final int arg) {
		
		final int localVariable = 1;
		//arg = 100; (x) final 이므로 값 변경 불가
		//localVariable = 100; (x) final 이므로 값 변경 불가
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바8 이후 : final 키워드를 명시하지 않아도, 값이 변경되지 않으면 내부 클래스에서 사용 가능 (effectively final)
	public void method2(int arg) {
		
		int localVariable = 1;
		//arg = 100; (x) 
		//localVariable = 100; (x)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}   