package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		
		// "C:/Temp/test8.txt" 경로의 텍스트 파일에 문자를 기록하기 위한 입력 스트림 생성
		// 파일이 없으면 새로 생성, 있으면 기존 내용을 덮어씀
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		// char 타입 문자 배열 생성
		char[] array = { 'A', 'B', 'C' };
		
		// 버퍼에 char 타입 배열의 데이터를 쌓음
		writer.write(array);
		
		// 버퍼에 쌓인 데이터를 대상에 강제로 출력
		writer.flush();
		// 스트림 닫기
		writer.close();
	}
}
