package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		
		// "C:/Temp/test3.db" 경로에 데이터를 저장하기 위한 출력 스트림 생성
		//  파일이 없으면 새로 생성, 있으면 기존 내용을 덮어씀
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		byte[] array =  { 10, 20, 30, 40, 50 };
		
		// 인덱스 1 위치부터, 3개의 데이터만 버퍼에 쌓음
		os.write(array, 1, 3);
		
		// 버퍼에 쌓인 데이터를 대상에 강제로 출력
		os.flush();
		// 스트림 닫기
		os.close();
	}
}
