package sec02.verify.exam11;

import java.util.Scanner;	//Scanner 클래스 사용을 위해 import

public class Exam11 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	//Scanner 클래스 객체 생성
		
		System.out.print("아이디:");
		String name = scanner.nextLine();	//문자열 입력받아서 대입
		
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();	//문자열 입력받아서 대입
		
		int password = Integer.parseInt(strPassword);	//문자열을 int 타입으로 변환
		
		if(name.equals("java")) {	//문자열 비교
			if(password == 12345) {	//숫자 비교
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
	}
}
