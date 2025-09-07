package sec03.exam01;

import java.io.*;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {
		
		// 표준 입력 스트림(System.in)을 InputStream으로 참조
		InputStream is = System.in;
		// 바이트 입력 스트림을 문자 입력 스트림으로 변환
		Reader reader = new InputStreamReader(is);
		// 문자 입력 스트림을 버퍼링 기능이 있는 BufferedReader로 감싸기
		BufferedReader br = new BufferedReader(reader);

		// 무한 루프를 돌며 입력 처리
		while(true)
		{
			System.out.print("입력하세요: ");
			String lineStr = br.readLine();
			if(lineStr.equals("q") || lineStr.equals("quit"))
			{
				break;
			}
			System.out.print("입력된내용: " + lineStr);
			System.out.println();
		}
		
		// 스트림 닫기
		br.close();
	}
}
