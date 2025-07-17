package sec02.exam05;

public class CharOperationExample {
	public static void main(String[] args) {
		
		char c1 = 'A' + 1;	//문자 리터럴 'A'의 유니코드 값(65)과 상수 리터럴 1을 더한 후 결과를 대입 (65 + 1 -> 66 -> 'B')
		char c2 = 'A';
		//char c3 = c2 + 1;    //컴파일 에러 발생(char 타입 + 정수 의 연산 결과는 int 타입), char c3 = (char) (c2 + 1); 이렇게 가능
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		//System.out.println("c3: " + c3);
	}
}
