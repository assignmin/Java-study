package sec02.exam02;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		
		int[] scores;
		scores = new int[] { 83, 90, 87 };	//new 키워드로 배열을 명시적으로 생성
		int sum1 = 0;
		for(int i=0; i<3; i++) {	//0부터 3미만까지 반복문 실행
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);	
		
		int sum2 = add( new int[] { 83, 90, 87 } );	//new로 배열을 생성하면서 매개변수로 넘김
		System.out.println("총합 : " + sum2);	
		System.out.println();
	}
	
	public static int add(int[] scores) {	//add 메소드 선언
		int sum = 0;
		for(int i=0; i<3; i++) {	//0부터 3미만까지 반복문 실행
			sum += scores[i];
		}
		return sum;		//배열의 요소를 더한 sum 반환
	}
}