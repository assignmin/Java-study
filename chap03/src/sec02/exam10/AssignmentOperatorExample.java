package sec02.exam10;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		
		int result = 0;		
		result += 10;	//10을 더한 값을 대입
		System.out.println("result=" + result);		
		result -= 5;	//5를 뺀 값을 대입
		System.out.println("result=" + result);		
		result *= 3;	//3을 곱한 값을 대입
		System.out.println("result=" + result);		
		result /= 5;	//5로 나눈 몫을 대입
		System.out.println("result=" + result);		
		result %= 3;	//3으로 나눈 나머지를 대입
		System.out.println("result=" + result);	
	}
}
