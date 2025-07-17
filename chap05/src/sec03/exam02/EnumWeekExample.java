package sec03.exam02;

import java.util.Calendar;	//Calendar 클래스 사용을 위해 import

import sec03.exam01.Week;	//Week 열거 타입 사용을 위해 import

public class EnumWeekExample {
	public static void main(String[] args) {
		
		Week today = null;	//Week 타입 변수를 선언하면서 null로 초기화
		
		Calendar cal = Calendar.getInstance();	//Calendar 인스턴스를 얻기 위해 Calendar 클래스의 getInstance() 메소드 호출
		int week = cal.get(Calendar.DAY_OF_WEEK);	//현재요일을 정수값으로 가져옴
		
		switch(week) {	//week의 값을 통해 요일 판별
			case 1:
				today = Week.SUNDAY; break;
			case 2:
				today = Week.MONDAY; break;
			case 3:
				today = Week.TUESDAY; break;
			case 4:
				today = Week.WEDNESDAY; break;
			case 5:
				today = Week.THURSDAY; break;
			case 6:
				today = Week.FRIDAY; break;				
			case 7:
				today = Week.SATURDAY; break;		
		}
		
		System.out.println("오늘 요일: "+ today);
		
		if(today == Week.SUNDAY) {	//주소값 비교
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}

