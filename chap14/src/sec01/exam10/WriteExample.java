package sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		
		// "C:/Temp/test8.txt" 경로의 텍스트 파일에 문자를 기록하기 위한 출력 스트림 생성
		// 파일이 없으면 새로 생성, 있으면 기존 내용을 덮어씀
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		String str = "ABC";
		
		// String 타입 데이터를 버퍼에 쌓음
		writer.write(str);
		
		// 버퍼에 쌓인 데이터를 대상에 강제로 출력
		writer.flush();
		// 스트림 닫기
		writer.close();
	}
}
