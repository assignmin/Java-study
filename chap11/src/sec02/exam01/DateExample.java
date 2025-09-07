package sec02.exam01;

import java.text.*;
import java.util.*;

public class DateExample {
	public static void main(String[] args) {
		
		// Date 객체 생성
		Date now = new Date();
		// 날짜와 시간을 지정된 형식으로 출력
		String strNow1 = now.toString();		
		System.out.println(strNow1);
		
		// SimpleDateFormat 객체 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// now 객체를 지정된 형식으로 변환한 새로운 String 객체 출력
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}

