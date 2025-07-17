package sec02.verify.exam07;

import java.util.Scanner;	//Scanner 클래스를 사용하기 위해 import

public class Exam07 {
	public static void main(String[] args) {
		
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);	//Scanner 클래스 객체 생성

		while (run) {	//while 반복문 실행(run이 플래그 변수)
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());	//믄자열을 입력받고 int 타입으로 변환

			switch (menuNum) {	//switch문 실행(피연산자는 menuNum)
			case 1:	//1일 경우
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());	//믄자열을 입력받고 int 타입으로 변환한 값을 더함
				break;
			case 2:	//2일 경우
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());	//믄자열을 입력받고 int 타입으로 변환한 값을 뺌
				break;
			case 3:	//3일 경우
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4:	//4일 경우
				run = false;
				break;
			}

			System.out.println();
		}

		System.out.println("프로그램 종료");
	}
}
