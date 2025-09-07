package sec02.exam03;

import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		
		// ReadLineExample 클래스와 같은 경로(resource)에 있는 "language.txt" 파일을 찾아서 문자 입력 스트림 생성
		Reader reader = new FileReader(
			ReadLineExample.class.getResource("language.txt").getPath()
		);
		
		// 내부 버퍼 두어 문자 입력 성능 향상 (보조 스트림)
		BufferedReader br = new BufferedReader(reader);
		
		while(true)
		{
			// 파일에서 한 줄 읽어와서 data에 대입
			String data = br.readLine();
			
			// 가져온 데이터가 없을 경우
			if(data == null)
			{
				break;
			}
			System.out.println(data);
		}
		
		// 스트림 닫기
		br.close();
	}
}
