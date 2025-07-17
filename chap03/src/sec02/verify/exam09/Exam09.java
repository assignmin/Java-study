package sec02.verify.exam09;

import java.util.Scanner;	//Scanner 클래스를 사용하기 위해 import

public class Exam09 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	//Scanner 클래스 객체 생성
		
		System.out.print("첫 번째 수: ");
		double num1 = Double.parseDouble(scanner.nextLine());	//문자열을 입력받고서 double 타입으로 변환
		
		System.out.print("두 번째 수: ");
		double num2 = Double.parseDouble(scanner.nextLine());	//문자열을 입력받고서 double 타입으로 변환
		
		System.out.println("---------------------");
		if(num2 != 0.0) {	//num2가 0.0이 아닌 경우
			System.out.println("결과: " + (num1/num2));
		} else {
			System.out.println("결과: 무한대");
		}
	}
}
