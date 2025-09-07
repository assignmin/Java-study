package sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		
		// "C:/Temp/test1.db" 경로의 파일을 바이트 단위로 읽어들이는 입력 스트림 생성
		// 파일이 없으면 FileNotFoundException 발생
		InputStream is = new FileInputStream("C:/Temp/test1.db");
		
		while(true)
		{
			// 파일에서 한 바이트 읽어서 int 타입으로 반환
			int data = is.read();
			// 파일에 데이터가 더 없을 경우
			if(data == -1)
			{
				break;
			}
			System.out.println(data);
		}
		// 스트림 닫기
		is.close();
	}
}
