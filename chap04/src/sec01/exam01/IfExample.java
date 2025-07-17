package sec01.exam01;

public class IfExample {
	public static void main(String[] args) {
		
		int score = 93;
		
		if(score>=90) {	//중괄호로 묶었을때(중괄호 내부에 조건문 적용)
			System.out.println("점수가 90보다 큽니다.");	//출력 o
			System.out.println("등급은 A 입니다.");		//출력 o
		}
		
		if(score< 90) 	//중괄호로 묶지 않았을때(바로 밑에 한줄에만 조건문 적용)
			System.out.println("점수가 90보다 작습니다.");	//출력 x
			System.out.println("등급은 B 입니다.");	//출력 o
	}
}
