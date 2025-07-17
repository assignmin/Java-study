package sec01.exam02;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score>=90) {	//만약 90 이상인 경우
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {	//아닌 경우
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}
}
