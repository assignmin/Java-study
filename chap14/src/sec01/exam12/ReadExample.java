package sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		
		// "C:/Temp/test8.txt" 경로의 텍스트 파일을 읽기 위한 문자 기반 입력 스트림 생성
		// 파일이 존재하지 않으면 FileNotFoundException 발생
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		// char 타입 배열 생성
		char[] buffer = new char[100];
		
		while(true)
		{
			// 파일의 데이터를 buffer에 저장 후, 읽은 문자 수 만큼을 반환
			int readCharNum = reader.read(buffer);
			// 파일에 데이터가 더 없을 경우
			if(readCharNum == -1)
			{
				break;
			}
			for(int i = 0; i < readCharNum; i++)
			{
				System.out.println(buffer[i]);
			}
		}
		// 스트림 닫기
		reader.close();
	}
}
