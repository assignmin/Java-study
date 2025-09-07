package sec01.exam11;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		
		// "C:/Temp/test7.txt" 경로의 텍스트 파일을 읽기 위한 문자 기반 입력 스트림 생성
		// 파일이 존재하지 않으면 FileNotFoundException 발생
		Reader reader = new FileReader("C:/Temp/test7.txt");
		
		while(true)
		{
			// 파일에서 한 문자 읽어서 int 타입으로 반환
			int data = reader.read();
			// 파일에 데이터가 더 없을 경우
			if(data == -1)
			{
				break;
			}
			System.out.println((char)data);
		}
		// 스트림 닫기
		reader.close();
	}
}
