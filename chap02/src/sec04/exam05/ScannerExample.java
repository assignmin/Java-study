package sec04.exam05;

import java.util.Scanner;	//Scanner 클래스를 사용하기 위해 import

public class ScannerExample {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);	//Scanner 클래스 객체 생성
		String inputData;

		while(true) {
			inputData = scanner.nextLine();	//문자열을 입력받고 문자열 반환
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) {	//입력된 문자열이 "q"와 같으면(inputData == "q" 라고 했을때는, 주소값을 비교하므로 q를 입력해도 false가 될 것)
				break;	//반복문 종료
			}
		
		}
		
		System.out.println("종료");
	}
}

