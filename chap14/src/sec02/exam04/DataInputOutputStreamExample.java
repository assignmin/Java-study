package sec02.exam04;

import java.io.*;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		
		// "C:/Temp/primitive.db" 파일에 데이터를 쓰기 위한 바이트 출력 스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		// int, double, boolean 같은 기본 자료형 데이터를 이진(binary) 형태로 기록할 수 있게 해줌 (보조 스트림)
		DataOutputStream dos = new DataOutputStream(fos);
		
		// 다양한 타입의 데이터를 버퍼에 쌓음
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		// 버퍼에 쌓인 데이터를 강제로 출력
		dos.flush();
		// 스트림 닫기
		dos.close();
		fos.close();
		
		// "C:/Temp/primitive.db" 파일을 읽는 바이트 입력 스트림 생성
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
		// int, double, boolean 같은 기본 자료형 데이터를 이진(binary) 형식 그대로 읽어올 수 있게 해줌 (보조 스트림)
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i < 2; i++)
		{
			// 다양한 타입의 데이터를 읽어옴
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		// 스트림 닫기
		dis.close();
		fis.close();
	}
}

