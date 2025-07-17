package sec02.exam01;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		
		int[] scores = { 83, 90, 87 };	//배열을 생성하면서 값 대입
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {	//i가 0부터 3미만 일때까지 i값 1씩 증가하며 반복문 실행
			sum += scores[i];	//sum에 배열의 요소 추가
		}
		System.out.println("총합 : " + sum);		
		double avg = (double) sum / 3;	//강제 타입 변환하여 나눗셈 수행
		System.out.println("평균 : " + avg);
	}
}