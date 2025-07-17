package sec02.exam10;

public class AdvancedForExample {
	public static void main(String[] args) {
		
		int[] scores = { 95, 71, 84, 93, 87 };	//int 타입 배열 선언하면서 요소 대입
		
		int sum = 0;
		for (int score : scores) {	//scores 배열의 요소를 하나씩 대입하며 반복(위의 경우는 5번 반복)
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;	//강제 타입 변환 후 나눗셈 수행
		System.out.println("점수 평균 = " + avg);

	} 
}
