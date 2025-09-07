package sec02.exam02;

import java.io.*;

public class NonBufferVsBufferExample {
	public static void main(String[] args) throws Exception {
		
		// 바이트 입출력 스트림
		String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		// 바이트 입출력 스트림
		// 내부 버퍼를 이용해 바이트 입출력 성능 향상
		String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);	// 보조 스트림
		BufferedOutputStream bos = new BufferedOutputStream(fos2);	// 보조 스트림
		
		// 입출력 수행 시간 측정
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t" + nonBufferTime + "ns");
		
		// 입출력 수행 시간 측정
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때:\t\t" + bufferTime + "ns");
		
		// 스트림 닫기
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	static int data = -1;
	
	public static long copy(InputStream is, OutputStream os) throws Exception
	{
		// 시간 측정
		long start = System.nanoTime();
		
		while(true)
		{
			// 한 바이트씩 가져와서 읽음
			data = is.read();
			// 데이터가 더 없을 경우
			if(data == -1)
			{
				break;
			}
			// 버퍼에 한 바이트 쌓음
			os.write(data);
		}
		// 버퍼에 쌓인 데이터 강제로 출력
		os.flush();
		// 시간 측정
		long end = System.nanoTime();
		// 수행 시간 반환
		return (end-start);
	}
}
