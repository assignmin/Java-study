package sec02.exam05;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		
		// "C:/Temp/printstream.txt" 파일에 바이트 단위 출력 스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		// FileOutputStream을 감싸 보조 스트림으로 사용
		// print(), println(), printf() 메서드로 문자열/숫자 등을 손쉽게 파일에 기록할 수 있음
		PrintStream ps = new PrintStream(fos);
		
		// 버퍼에 데이터 쌓음
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		
		// 버퍼에 쌓인 데이터를 강제로 출력
		ps.flush();
		// 스트림 닫기
		ps.close();
	}
}
