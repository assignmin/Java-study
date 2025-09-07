package sec02.verify.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
	public static void main(String[] args) {
		
		// Date 객체 생성
		Date now = new Date();
		
		// SimpleDateFormat 객체 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		// now 객체를 지정된 형식으로 출력
		System.out.println( sdf.format(now) );
	}
}
