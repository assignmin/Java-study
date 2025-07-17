package sec01.exam03;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		
		int score = 75;
		
		if(score>=90) {	//만약 90 이상인 경우
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if(score>=80) {	//아니고 만약 80 이상인 경우
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if(score>=70) {	//아니고 만약 70 이상인 경우
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		} else {	//아닌 경우
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}
}
