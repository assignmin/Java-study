package sec02.verify.exam06;

import java.util.Scanner;	//Scanner 클래스 사용을 위해 import

public class Exam06 {
	public static void main(String[] args) {
		
		boolean run = true;

		int studentNum = 0;
		int[] scores = null;	//int 타입 배열 선언하면서 null로 초기화

		Scanner scanner = new Scanner(System.in);	//Scanner 클래스로 객체 생성

		while (run) {	//run은 플래그 변수(반복문 흐름 제어)
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());	//문자열을 입력받아 int 타입으로 변환

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());	//문자열을 입력받아 int 타입으로 변환
				scores = new int[studentNum];	//studentNum 크기만큼의 int 타입 배열 생성
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {	//scores의 길이만큼 반복
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());	//문자열을 입력받아 int 타입으로 반환
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {	//scores의 길이만큼 반복
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {	//scores의 길이만큼 반복
					max = (max < scores[i]) ? scores[i] : max;	//삼항연산자 사용
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				run = false;	//run을 false로 변경해서 while문 종료
			}
		}

		System.out.println("프로그램 종료");
	}
}
