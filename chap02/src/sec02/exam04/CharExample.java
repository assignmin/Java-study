package sec02.exam04;

public class CharExample {
	public static void main(String[] args) {
		
		char c1 = 'A';          	//문자를 직접 저장
		char c2 = 65;          		//십진수로 저장(정수 리터럴 대입)
		char c3 = '\u0041';    		//16진수로 저장(유니코드)
		
		char c4 = '가';         		//문자를 직접 저장
		char c5 = 44032;      		//십진수로 저장(정수 리터럴 대입)
		char c6 = '\uac00';    		//16진수로 저장(유니코드)
		
		System.out.println(c1);		//A 출력
		System.out.println(c2);		//A 출력		
		System.out.println(c3);		//A 출력
		System.out.println(c4);		//가 출력
		System.out.println(c5);		//가 출력
		System.out.println(c6);		//가 출력
	}
}