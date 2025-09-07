package sec01.exam06;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		
		// "C:/Temp/test3.db" 경로의 파일을 바이트 단위로 읽어들이는 입력 스트림 생성
		// 파일이 없으면 FileNotFoundException 발생
		InputStream is = new FileInputStream("C:/Temp/test3.db");
		
		// byte 타입 배열 생성
		byte[] buffer = new byte[5];
		
		// 파일의 데이터를 3개 만큼 buffer의 인덱스 2 위치부터 저장 후, 읽은 바이트 수 (3) 반환
		int readByteNum = is.read(buffer, 2, 3);
		// 파일에 데이터가 없을 경우
		if(readByteNum != -1)
		{
			for(int i = 0; i < buffer.length; i++)
			{
				System.out.println(buffer[i]);
			}
		}
		// 스트림 닫기
		is.close();
	}
}
