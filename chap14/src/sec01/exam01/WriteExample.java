package sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		
		// "C:/Temp/test1.db" 경로에 데이터를 저장하기 위한 출력 스트림 생성
		//  파일이 없으면 새로 생성, 있으면 기존 내용을 덮어씀
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// 버퍼에 데이터 쌓기
		os.write(a);
		os.write(b);
		os.write(c);
		
		// 버퍼에 쌓인 데이터를 대상에 강제로 출력
		os.flush();
		// 스트림 닫기
		os.close();
	}
}
