package sec04.verify.exam03;

import java.util.Scanner;	//Scanner 클래스를 사용하기 위해 import

public class Exam03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	//Scanner 클래스 객체 생성
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();	//문자열 입력 후 반환
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String ssn = scanner.nextLine();	//문자열 입력 후 반환
		
		System.out.print("3. 전화번호: ");
		String tel = scanner.nextLine();	//문자열 입력 후 반환
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름: " + name);
		System.out.println("2. 주민번호 앞 6자리: " + ssn);
		System.out.println("3. 전화번호: " + tel);
	}
}
