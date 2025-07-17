package sec03.exam02;

public enum Week {	//열거 타입 변수(Week today = Week.MONDAY; 에서 today)는 Stack 영역에, 열거 상수 객체(Week.MONDAY, Week.TUESDAY...)는 Heap 영역에, 열거 상수 객체를 참조하는 static 변수는 Method 영역에 위치
	  MONDAY,
	  TUESDAY,
	  WEDNESDAY,
	  THURSDAY,
	  FRIDAY,
	  SATURDAY,
	  SUNDAY
}
