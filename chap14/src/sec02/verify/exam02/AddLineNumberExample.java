package sec02.verify.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		
		// 읽어올 파일의 경로 지정
		String filePath = "src/sec02/verify/exam02/AddLineNumberExample.java";
		
		// 문자 기반 파일 입력 스트림 생성
		FileReader fr = new FileReader(filePath);
		// 성능 향상을 위해 BufferedReader로 감싸기
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		// 파일 끝까지 한 줄씩 읽기
		while( (rowData=br.readLine())!= null )
		{
			// 줄 번호 증가시키면서 출력
			System.out.println(++rowNumber + ": " + rowData);
		}
		
		// 스트림 닫기
		br.close();
	}
}
