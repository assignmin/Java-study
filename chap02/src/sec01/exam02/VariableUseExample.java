package sec01.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");	//시간을 시간 분 으로 출력
		
		int totalMinute = (hour*60) + minute;				//시간을 분으로 환산
		System.out.println("총 " + totalMinute + "분");		//시간을 분 으로 출력
	}

}
