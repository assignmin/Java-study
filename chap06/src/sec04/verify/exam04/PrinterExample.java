package sec04.verify.exam04;

public class PrinterExample {
	public static void main(String[] args) {
		
		// 객체 생성없이 클래스의 정적 메소드 호출
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}
}
