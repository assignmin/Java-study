package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	// write() 메서드
	public static void write(String str) throws Exception
	{
		// "C:/Temp/test1.txt" 경로에 데이터를 저장하기 위한 출력 스트림 생성
		//  파일이 없으면 새로 생성, 있으면 기존 내용을 덮어씀
		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt");
		// 바이트 스트림을 문자 스트림으로 변환 (보조 스트림)
		Writer writer = new OutputStreamWriter(fos);
		// str을 버퍼에 쌓음
		writer.write(str);
		// 버퍼에 쌓인 내용 강제로 출력
		writer.flush();
		// 스트림 닫기
		writer.close();
	}
	
	public static String read() throws Exception
	{
		// "C:/Temp/test1.txt" 경로의 파일을 바이트 단위로 읽어들이는 입력 스트림 생성
		// 파일이 없으면 FileNotFoundException 발생
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
		// 바이트 스트림을 문자 스트림으로 변환 (보조 스트림)
		Reader reader = new InputStreamReader(fis);
		// 문자 배열 생성
		char[] buffer = new char[100];
		// 파일의 데이터를 가져와서, buffer에 저장 후, 저장한 문자 수 반환
		int readCharNum = reader.read(buffer);
		// 스트림 닫기
		reader.close();
		// 문자 배열을 통해 문자열 생성
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
}
