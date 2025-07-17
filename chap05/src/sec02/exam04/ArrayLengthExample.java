package sec02.exam04;

public class ArrayLengthExample {
	public static void main(String[] args) {
		
		int[] scores = { 83, 90, 87 };	//배열을 선언하고 값 대입
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {	//배열의 길이(요소의 수)만큼 반복
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;	//배열 요소를 모두 더한 값을 배열의 길이로 나눔
		System.out.println("평균 : " + avg);
	}
}
