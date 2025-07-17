package sec04.verify.exam02;

import java.util.Scanner;	//Scanner 클래스를 사용하기 위해 import

public class Exam02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	//Scanner 클래스 객체 생성
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();	//문자열 입력 후 반환
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();	//문자열 입력 후 반환
		int num1 = Integer.parseInt(strNum1);	//문자열을 int 타입으로 변환
		int num2 = Integer.parseInt(strNum2);	//문자열을 int 타입으로 변환
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}
}
