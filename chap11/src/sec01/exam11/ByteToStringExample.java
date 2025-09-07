package sec01.exam11;

public class ByteToStringExample {
	public static void main(String[] args) {
		
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97  };
		
		// bytes 배열의 요소를 문자열로 변환
		String str1 = new String(bytes);
		System.out.println(str1);
		
		// bytes 배열의 6번 인덱스부터 4개를 문자열로 변환
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}
}
