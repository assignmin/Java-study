package sec01.exam06;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		
		//8<= … < 12(8+4) 사이의 정수 얻기
		int time = (int)(Math.random()*4) + 8;	//8부터 11 사이의 난수 하나 반환 
		System.out.println("[현재시간: " + time + " 시]");
		
		switch(time) {	//switch문의 피연산자로 time 대입(switch문 내부에 break문 존재 x -> case 하나 실행하고 그 밑에 case도 다 실행)
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
		}
	}
}
