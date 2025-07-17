package sec03.verify.exam03;

public class HttpServletExample {
	public static void main(String[] args) {
		
		// 객체를 생성하고 메소드의 인자로 넘겨줌
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
	
	// 메소드(매개변수로 HttpServlet 타입을 받음)
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
