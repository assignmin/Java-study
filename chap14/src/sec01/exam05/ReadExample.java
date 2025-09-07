package sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		
		// "C:/Temp/test2.db" 경로의 파일을 바이트 단위로 읽어들이는 입력 스트림 생성
		// 파일이 없으면 FileNotFoundException 발생
		InputStream is = new FileInputStream("C:/Temp/test2.db");
		
		// byte 배열 생성
		byte[] buffer = new byte[100];
		
		while(true)
		{
			// 파일의 데이터를 buffer에 저장 후, 읽은 바이트 수 만큼을 반환
			int readByteNum = is.read(buffer);
			// 파일에 데이터가 더 없을 경우
			if(readByteNum == -1)
			{
				break;
			}
			for(int i = 0; i < readByteNum; i++)
			{
				System.out.println(buffer[i]);
			}
		}
		// 스트림 닫기
		is.close();
	}
}
