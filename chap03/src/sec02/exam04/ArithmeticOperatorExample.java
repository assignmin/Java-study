package sec02.exam04;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;	//덧셈 연산
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;	//뺄셈 연산
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;	//곱셈 연산
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;	//나눗셈 연산(int 타입끼리의 연산이므로 연산 결과도 int 타입)
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;	//나머지 연산(int 타입끼리의 연산이므로 연산 결과도 int 타입)
		System.out.println("result5=" + result5);
		
		double result6 = (double) v1 / v2;	//나눗셈 연산(명시적으로 타입 변환하여 연산 결과는 double 타입)
		System.out.println("result6=" + result6);	
	}
}
