package sec01.exam15;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		
		String str = "안녕하세요";
		
		// 문자열의 내용을 byte 배열로 변환해서 반환(기본 문자 인코딩으로 변환)
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		// bytes 배열의 내용을 변환해서 String 객체 생성
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);
		
		// 예외를 발생시킬수 있는 코드 실행
		try {
			
			// "EUC-KR" 로 인코딩
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			// bytes 배열을 "EUC-KR" 인코딩 방식으로 디코딩하여 문자열로 변환
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			// "UTF-8" 로 인코딩
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			// bytes 배열을 "UTF-8" 인코딩 방식으로 디코딩하여 문자열로 변환
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);		
			
		}
		// 지정한 문자 인코딩이 지원되지 않을 경우
		catch (UnsupportedEncodingException e) {
			
			// 상세한 오류 내용 출력
			e.printStackTrace();
		}
	}
}
