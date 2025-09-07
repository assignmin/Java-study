package sec01.exam12;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		// 키보드로 입력되는 bytes 배열을 읽어서 배열의 크기를 저장
		int readByteNo = System.in.read(bytes);

		// bytes 배열의 0 인덱스 부터 readByteNo-2 인덱스까지를 문자열로 변환
		// -2를 한 이유는 bytes 배열의 뒤쪽에 \r(CR) 과 \n(LF) 이 포함되어있기 때문
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}
}