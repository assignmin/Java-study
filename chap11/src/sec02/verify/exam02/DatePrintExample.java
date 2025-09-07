package sec02.verify.exam02;

import java.util.Calendar;

public class DatePrintExample {
	public static void main(String[] args) {
		
		// Calendar 인스턴스 생성
		Calendar now = Calendar.getInstance();
		
		// 현재 연도
		int year = now.get(Calendar.YEAR);
		
		// 현재 월을 가져오고, 0부터 시작하는 월을 1부터 시작하는 형태로 보정
		int month = now.get(Calendar.MONTH) + 1;
		String strMonth = (month<10)? ("0"+month) : (""+month);
		
		// 현재 일을 가져옴
		int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
		String strDayOfMonth = (dayOfMonth<10)? ("0"+dayOfMonth) : (""+dayOfMonth);
		
		// 요일 배열 정의
		String[] dayArray = {"일", "월", "화", "수", "목", "금", "토"};
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek = dayArray[dayOfWeek-1] + "요일";
		
		// 현재 시간을 24시간 형식으로 가져옴
		int hour = now.get(Calendar.HOUR_OF_DAY);
		String strHour = (hour<10)? ("0"+hour) : (""+hour);
		
		// 현재 초를 가져옴
		int second = now.get(Calendar.SECOND);
		String strSecond = (second<10)? ("0"+second) : (""+second);
		
		System.out.print(year + "년 ");
		System.out.print(strMonth + "월 ");
		System.out.print(strDayOfMonth + "일 ");
		System.out.print(strDayOfWeek + " ");
		System.out.print(strHour + "시 ");
		System.out.print(strSecond + "분 ");
	}
}
