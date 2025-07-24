package sec01.exam05;

public class OutterExample {
	public static void main(String[] args) {
		
		// Outter 객체 생성
		Outter outter = new Outter();
		// 내부 클래스 객체 생성
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}
